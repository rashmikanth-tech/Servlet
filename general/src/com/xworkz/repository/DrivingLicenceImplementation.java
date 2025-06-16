package com.xworkz.repository;

import com.xworkz.dto.DrivingLicenceDto;

import java.sql.*;

public class DrivingLicenceImplementation implements DrivingLicenceRepository {

    @Override
    public void saveDrivingLicence(DrivingLicenceDto dto) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/driving_db";
        String username = "root";
        String password = "@Sql182530";

        Connection connection = DriverManager.getConnection(url, username, password);

        String insertQuery = "INSERT INTO driving_licence_applay (name, address, mobile, apply_date, vehicle_type) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps = connection.prepareStatement(insertQuery);
        ps.setString(1, dto.getPersonName());
        ps.setString(2, dto.getAdessAdress());
        ps.setLong(3, dto.getMobileNum());
        ps.setDate(4, Date.valueOf(dto.getApplayDate()));
        ps.setString(5, dto.getVehiclVehicle());

        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("✅ Data inserted successfully!");
        } else {
            System.out.println("❌ Failed to insert data.");
        }

        ps.close();
        connection.close();
    }
}
