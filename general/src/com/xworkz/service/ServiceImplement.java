package com.xworkz.service;

import com.xworkz.dto.JobDto;
import com.xworkz.repository.JobRepository;
import com.xworkz.repository.JobRepositoryImpl;

public class ServiceImplement implements JobService {

private JobRepository jobRepository = new JobRepositoryImpl();
    @Override
    public String jobValidate(JobDto jobDto) {
        if (jobDto == null) {
            return "Job Dto Is Null";
        }

        try {
            jobRepository.jobValidateAndSave(jobDto);
            return "Sucess";
        } catch (Exception e) {
            e.printStackTrace();
            return "error while inserting data: " + e.getMessage();
        }

        }

    }

