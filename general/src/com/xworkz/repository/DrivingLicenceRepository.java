package com.xworkz.repository;

import com.xworkz.dto.DrivingLicenceDto;

import java.sql.SQLException;

public interface DrivingLicenceRepository {
    void saveDrivingLicence(DrivingLicenceDto drivingLicenceDto) throws ClassNotFoundException, SQLException;

}
