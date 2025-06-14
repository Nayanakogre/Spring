package com.xworkz.college.fest.repository;

import com.xworkz.college.fest.dto.CollegeFestDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CollegeFestRepoImpl implements CollegeFestRepo{
    @Override
    public void save(CollegeFestDto collegeFestDto) {
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "Nayana@07";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
        String query = "INSERT INTO college_fest (name, email, contact, competition, college) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,collegeFestDto.getName());
            preparedStatement.setString(2,collegeFestDto.getEmail());
            preparedStatement.setString(3,collegeFestDto.getContact());
            preparedStatement.setString(4,collegeFestDto.getCompetition());
            preparedStatement.setString(5,collegeFestDto.getCollege());
            preparedStatement.executeUpdate();
            System.out.println("inserted successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
