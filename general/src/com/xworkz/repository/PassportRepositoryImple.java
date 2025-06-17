package com.xworkz.repository;

import com.mysql.jdbc.Driver;
import com.xworkz.dto.PassportDto;

import java.sql.*;

public class PassportRepositoryImple implements PassportRepository{

    @Override
    public void saveAndApplay(PassportDto passportDto) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "";
        String username ="root";
        String pass = "@Sql182530";

        Connection connection = DriverManager.getConnection(url,username,pass);

        String insertQuery = "insert into ----- () values ()";

        PreparedStatement pS = connection.prepareStatement(insertQuery);
        pS.setString(1,passportDto.getNameName());
        pS.setDouble(2,passportDto.getAdharAdhar());
        Applicant Name:
        Adhar No:
        Address:
        PanNo:
        Country :
        State:
        City:
        PinCode:
        PassportType:

    }
}
