package com.xworkz.hiring.repository;

import com.xworkz.hiring.dto.HiringDto;
import com.xworkz.hiring.util.HiringUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HiringRepoImpl implements HiringRepo {
    @Override
    public boolean save(HiringDto hiringDto) {
        try {
            Class.forName(HiringUtil.driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String save="INSERT INTO hiring_app(name,email,role) values(?,?,?)";
        try {
            Connection connection= DriverManager.getConnection(HiringUtil.url,HiringUtil.username,HiringUtil.password);
            PreparedStatement pstmt=connection.prepareStatement(save);
            pstmt.setString(1,hiringDto.getName());
            pstmt.setString(2,hiringDto.getEmail());
            pstmt.setString(3,hiringDto.getRole());
            pstmt.executeUpdate();
            System.out.println("saved to the database successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}
