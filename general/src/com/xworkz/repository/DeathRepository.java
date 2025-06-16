package com.xworkz.repository;

import com.xworkz.dto.DeathDto;

import java.sql.SQLException;

public interface DeathRepository {
    void validateAndSave(DeathDto deathDto) throws ClassNotFoundException, SQLException;
}
