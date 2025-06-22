package com.xworkz.woman.complaint.repository;

import com.xworkz.woman.complaint.dto.ComplaintDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComplaintRepositoryImpl implements ComplaintRepository{
    @Override
    public boolean save(ComplaintDto complaintDto) {
        String url = "jdbc:mysql://localhost:3306/complaint";
        String username = "root";
        String password = "Nayana@07";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String insert="INSERT INTO police_complaint(name,phoneNo,issue,issueType,dateTime,location) VALUES(?,?,?,?,?,?)";

        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            PreparedStatement pstmt=connection.prepareStatement(insert);
            pstmt.setString(1,complaintDto.getName());
            pstmt.setLong(2,complaintDto.getPhoneNo());
            pstmt.setString(3,complaintDto.getIssue());
            pstmt.setString(4,complaintDto.getIssueType());
            pstmt.setTimestamp(5,complaintDto.getDateTime());
            pstmt.setString(6,complaintDto.getLocation());
            pstmt.executeUpdate();
            System.out.println("Inserted successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public List<ComplaintDto> view() {
        String url = "jdbc:mysql://localhost:3306/complaint";
        String username = "root";
        String password = "Nayana@07";
        String driver = "com.mysql.cj.jdbc.Driver";
        List<ComplaintDto> complList=new ArrayList<ComplaintDto>();
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String view="SELECT * FROM police_complaint";
        try {
            Connection connection=DriverManager.getConnection(url,username,password);
            PreparedStatement pstmt=connection.prepareStatement(view);
                ResultSet rs = pstmt.executeQuery();
                while(rs.next())
                {
                    ComplaintDto dto=new ComplaintDto();
                    dto.setName(rs.getString(1));
                    dto.setPhoneNo(rs.getLong(2));
                    dto.setIssue(rs.getString(3));
                    dto.setIssueType(rs.getString(4));
                    dto.setDateTime(rs.getTimestamp(5));
                    dto.setLocation(rs.getString(6));

                    complList.add(dto);
                    System.out.println("viewed successfully");
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return complList;
    }
}
