package com.xworkz.repository;

import com.xworkz.dto.BirthCertificatDto;

import java.sql.*;

public class BirthRepositoryImplement implements BirthRepository{

    public void ValidateAndSave(BirthCertificatDto birthCertificatDto) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/birth_certificate";
        String username="root";
        String pass="@Sql182530";

       Connection connection = DriverManager.getConnection(url,username,pass);

       String insert = "insert into birth_certificate_applay (birthBirthId,hospitalName,fatherName,motherName,dateAndTime,doctorName,nurseName,hospitalType) Values(?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setString(1,birthCertificatDto.getBirthBirthId() );
        preparedStatement.setString(2,birthCertificatDto.getHospitalName());
        preparedStatement.setString(3,birthCertificatDto.getFatherName());
        preparedStatement.setString(4,birthCertificatDto.getMotherName());
        preparedStatement.setTimestamp(5, Timestamp.valueOf(birthCertificatDto.getDateAndTime()));
        preparedStatement.setString(6,birthCertificatDto.getDoctorName());
        preparedStatement.setString(7,birthCertificatDto.getNurseName());
        preparedStatement.setString(8,birthCertificatDto.getHospitalType());

        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Data inserted successfully!");
        } else {
            System.out.println(" Failed to insert data.");
        }

        preparedStatement.close();
        connection.close();
    }
    }

