package com.xworkz.service;

import com.xworkz.dto.BirthCertificatDto;
import com.xworkz.repository.BirthRepository;
import com.xworkz.repository.BirthRepositoryImplement;

public class BirthImplement implements BirthCertificateService{

   private BirthRepository birthRepository = new BirthRepositoryImplement();

    @Override
    public String birthValidate(BirthCertificatDto birthCertificatDto){
        if(birthCertificatDto == null){
            return "Birth certificate is null";
        }
        try {
            birthRepository.ValidateAndSave(birthCertificatDto);
            return "Sucess";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
