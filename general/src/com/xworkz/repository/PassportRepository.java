package com.xworkz.repository;

import com.xworkz.dto.PassportDto;

import java.sql.SQLException;

public interface PassportRepository {
    void saveAndApplay(PassportDto passportDto) throws ClassNotFoundException, SQLException;
}
