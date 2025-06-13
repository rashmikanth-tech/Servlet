package com.xworkz.repository;

import com.xworkz.dto.JobDto;

public class JobRepositoryImpl implements JobRepository{
    @Override
    public void apply(JobDto jobDto) {
        System.out.println("Applay for job");
    }
//    jdbc:mysql://localhost:3306/?user=root
//    root@localhost:3306


}
