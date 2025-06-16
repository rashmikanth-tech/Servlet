package com.xworkz.service;

import com.xworkz.dto.DrivingLicenceDto;
import com.xworkz.repository.DrivingLicenceImplementation;
import com.xworkz.repository.DrivingLicenceRepository;

public class LicenceImplement implements DrivingLicenceService {

    private DrivingLicenceRepository drivingLicenceImplementation = new DrivingLicenceImplementation();

    @Override
    public String validate(DrivingLicenceDto drivingLicenceDto) {
        // You can add validation checks here
        if (drivingLicenceDto == null) {
            return "DTO is null";
        }

        try {
            drivingLicenceImplementation.saveDrivingLicence(drivingLicenceDto);  // ✅ Insert into DB
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error while inserting data: " + e.getMessage();
        }
    }
}
