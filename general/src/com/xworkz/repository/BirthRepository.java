package com.xworkz.repository;

import com.xworkz.dto.BirthCertificatDto;

import java.sql.SQLException;

public interface BirthRepository {
    void ValidateAndSave(BirthCertificatDto birthCertificatDto)  throws ClassNotFoundException, SQLException;
}
