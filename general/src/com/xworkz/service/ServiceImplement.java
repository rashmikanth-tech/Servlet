package com.xworkz.service;

import com.xworkz.dto.JobDto;

public class ServiceImplement implements JobService {


    @Override
    public String jobValidate(JobDto jobDto) {
        return "Failed";
    }
}
