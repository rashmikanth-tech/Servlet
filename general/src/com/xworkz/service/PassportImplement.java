package com.xworkz.service;

import com.xworkz.dto.PassportDto;
import com.xworkz.repository.PassportRepository;
import com.xworkz.repository.PassportRepositoryImple;

import java.sql.SQLException;

public class PassportImplement implements PassportService{

   private PassportRepository passportRepository = new PassportRepositoryImple();
    @Override
    public String save(PassportDto passportDto){
        if (passportDto == null){
            return "Passport Dto is Null";
        }
       else {
            try {
                passportRepository.saveAndApplay(passportDto);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return "Success";
        }
    }
}
