package com.xworkz.repository;

import com.xworkz.dto.JobDto;

public interface JobRepository {

    void jobValidateAndSave(JobDto jobDto);
}
