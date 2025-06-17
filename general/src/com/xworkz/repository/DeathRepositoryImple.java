package com.xworkz.repository;

import com.mysql.cj.x.protobuf.MysqlxPrepare;
import com.mysql.jdbc.Driver;
import com.xworkz.dto.DeathDto;

import java.sql.*;

import static java.time.chrono.JapaneseEra.values;

public class DeathRepositoryImple implements  DeathRepository{

   public   void validateAndSave(DeathDto deathDto) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/death_data";
        String username="root";
        String pass="@Sql182530";

       Connection connection = DriverManager.getConnection(url,username,pass);

      String insertQuery = "insert into death_save (DeceasedName,CauseOfDeath,DateOfDeath,TimeOfDeath,AgeAtDeath,CertifiedBy,HospitalName,MannerOfDeath,Gender,Marks) values (?,?,?,?,?,?,?,?,?,?)";

       PreparedStatement preparedStatement= connection.prepareStatement(insertQuery);
       preparedStatement.setString(1, deathDto.getDeceasedName());
       preparedStatement.setString(2, deathDto.getCauseOfDeath());
       preparedStatement.setDate(3, Date.valueOf(deathDto.getDateOfDeath()));
       preparedStatement.setTime(4, deathDto.getTimeOfDeath());
       preparedStatement.setInt(5, deathDto.getAgeAtDeath());
       preparedStatement.setString(6, deathDto.getCertifiedBy());
       preparedStatement.setString(7, deathDto.getHospitalName());
       preparedStatement.setString(8, deathDto.getMannerOfDeath());
       preparedStatement.setString(9, deathDto.getGender());
       preparedStatement.setString(10, deathDto.getMarks());

       int roeEffected = preparedStatement.executeUpdate();
       if (roeEffected > 0) {
           System.out.println("Data inserted successfully");
       } else {
           System.out.println(" Failed to insert data");
       }

       preparedStatement.close();
       connection.close();

    }
}
