package com.xworkz.service;

import com.xworkz.dto.BirthCertificatDto;
import com.xworkz.dto.DeathDto;
import com.xworkz.repository.BirthRepository;
import com.xworkz.repository.BirthRepositoryImplement;
import com.xworkz.repository.DeathRepository;
import com.xworkz.repository.DeathRepositoryImple;

public class DeathImplement implements DeathService{

    private DeathRepository deathRepository = new DeathRepositoryImple();
    @Override
    public String validate(DeathDto deathDto){
        if (deathDto == null) {
            return "Birthdto is Null";
        }
        try {
            deathRepository.validateAndSave(deathDto);
            return "Inserted Sucess";}
        catch (Exception e) {
            e.printStackTrace();
            return "error while inserting data: " + e.getMessage();
        }
    }
}
