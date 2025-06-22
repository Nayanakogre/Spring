package com.xworkz.seed.repository;

import com.xworkz.seed.dto.SeedInfoDto;
import com.xworkz.seed.util.SeedInfoUtil;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class SeedInfoRepoImpl implements SeedInfoRepo {
    @Override
    public boolean save(SeedInfoDto seedInfoDto) {
        try {
            Class.forName(SeedInfoUtil.driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String save = "INSERT INTO seed_info(seedName, type, variety, quantity, price, createdBy, createdAt) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection connection = DriverManager.getConnection(SeedInfoUtil.url,
                    SeedInfoUtil.username, SeedInfoUtil.password);
            PreparedStatement pstmt = connection.prepareStatement(save);
            pstmt.setString(1, seedInfoDto.getSeedName());
            pstmt.setString(2, seedInfoDto.getType());
            pstmt.setString(3, seedInfoDto.getVariety());
            pstmt.setDouble(4, seedInfoDto.getQuantity());
            pstmt.setDouble(5, seedInfoDto.getPrice());
            pstmt.setString(6, seedInfoDto.getCreatedBy());
            pstmt.setTimestamp(7, Timestamp.valueOf(seedInfoDto.getCreatedAt()));
            pstmt.executeUpdate();
            System.out.println("Saved successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public SeedInfoDto searchById(int id) {
        String sql = "SELECT id, seedName, type, variety, quantity, price FROM seed_info WHERE id = ?";
        try {
            Class.forName(SeedInfoUtil.driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(SeedInfoUtil.url, SeedInfoUtil.username, SeedInfoUtil.password);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, id);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    SeedInfoDto dto = new SeedInfoDto();
                    dto.setId(rs.getInt("id"));  // fetched from DB
                    dto.setSeedName(rs.getString("seedName"));
                    dto.setType(rs.getString("type"));
                    dto.setVariety(rs.getString("variety"));
                    dto.setQuantity(rs.getInt("quantity"));
                    dto.setPrice(rs.getDouble("price"));
                    return dto;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean deleteById(int id) {
        String sql = "DELETE FROM seed_info WHERE id = ?";

        try {
            Class.forName(SeedInfoUtil.driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(SeedInfoUtil.url, SeedInfoUtil.username, SeedInfoUtil.password);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<SeedInfoDto> viewAll() {
        String view = "SELECT * from seed_info";
        List<SeedInfoDto> seedList = new ArrayList<SeedInfoDto>();
        try {
            Class.forName(SeedInfoUtil.driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(SeedInfoUtil.url, SeedInfoUtil.username, SeedInfoUtil.password);
             PreparedStatement pstmt = connection.prepareStatement(view)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                SeedInfoDto seedInfoDto = new SeedInfoDto();
                seedInfoDto.setId(rs.getInt(1));
                seedInfoDto.setSeedName(rs.getString(2));
                seedInfoDto.setType(rs.getString(3));
                seedInfoDto.setVariety(rs.getString(4));
                seedInfoDto.setQuantity(rs.getDouble(5));
                seedInfoDto.setPrice(rs.getDouble(6));
                seedInfoDto.setCreatedBy(rs.getString(7));
                seedInfoDto.setCreatedAt(rs.getTimestamp(8).toLocalDateTime());
                seedList.add(seedInfoDto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return seedList;
    }

    @Override
    public boolean update(SeedInfoDto dto) {
        try {
            Class.forName(SeedInfoUtil.driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String update = "UPDATE seed_info SET seedName=?, type=?, variety=?, quantity=?, price=?, createdBy=? WHERE id=?";
        try {
            Connection connection = DriverManager.getConnection(SeedInfoUtil.url, SeedInfoUtil.username, SeedInfoUtil.password);
            PreparedStatement pstmt = connection.prepareStatement(update);
            pstmt.setString(1, dto.getSeedName());
            pstmt.setString(2, dto.getType());
            pstmt.setString(3, dto.getVariety());
            pstmt.setDouble(4, dto.getQuantity());
            pstmt.setDouble(5, dto.getPrice());
            pstmt.setString(6,dto.getCreatedBy());
            //pstmt.setTimestamp(6, Timestamp.valueOf(dto.getCreatedAt()));

            pstmt.setInt(7, dto.getId());

            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public List<SeedInfoDto> serachByType(String type) {
        try {
            Class.forName(SeedInfoUtil.driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        List<SeedInfoDto> seedList=new ArrayList<>();
        String search = "SELECT * FROM seed_info WHERE type = ?";
        try {
            Connection connection = DriverManager.getConnection(SeedInfoUtil.url, SeedInfoUtil.username, SeedInfoUtil.password);
            PreparedStatement pstmt = connection.prepareStatement(search);
            pstmt.setString(1, type);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                SeedInfoDto dto = new SeedInfoDto();
                dto.setId(rs.getInt("id"));
                dto.setSeedName(rs.getString("seedName"));
                dto.setType(rs.getString("type"));
                dto.setVariety(rs.getString("variety"));
                dto.setQuantity(rs.getDouble("quantity"));
                dto.setPrice(rs.getDouble("price"));
                dto.setCreatedBy(rs.getString("createdBy"));
                dto.setCreatedAt(rs.getTimestamp("createdAt").toLocalDateTime());


                seedList.add(dto);
                return seedList;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return seedList;
    }


}

