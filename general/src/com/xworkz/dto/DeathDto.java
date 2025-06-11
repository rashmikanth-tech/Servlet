package com.xworkz.dto;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;

public class DeathDto implements Serializable {
    private String deceasedName;
    private String causeOfDeath;
    private LocalDate dateOfDeath;
    private Time timeOfDeath;
    private int ageAtDeath;
    private  String certifiedBy;
    private String hospitalName;
    private  String mannerOfDeath;
    private String gender;
    private  String marks;

    private DeathDto(){
        System.out.println("Created Death Dto");
    }

    public DeathDto(String deceasedName, String causeOfDeath, LocalDate dateOfDeath, Time timeOfDeath, int ageAtDeath, String certifiedBy, String hospitalName, String mannerOfDeath, String gender, String marks) {
        this.deceasedName = deceasedName;
        this.causeOfDeath = causeOfDeath;
        this.dateOfDeath = dateOfDeath;
        this.timeOfDeath = timeOfDeath;
        this.ageAtDeath = ageAtDeath;
        this.certifiedBy = certifiedBy;
        this.hospitalName = hospitalName;
        this.mannerOfDeath = mannerOfDeath;
        this.gender = gender;
        this.marks = marks;
    }

    public String getDeceasedName() {
        return deceasedName;
    }

    public void setDeceasedName(String deceasedName) {
        this.deceasedName = deceasedName;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public Time getTimeOfDeath() {
        return timeOfDeath;
    }

    public void setTimeOfDeath(Time timeOfDeath) {
        this.timeOfDeath = timeOfDeath;
    }

    public int getAgeAtDeath() {
        return ageAtDeath;
    }

    public void setAgeAtDeath(int ageAtDeath) {
        this.ageAtDeath = ageAtDeath;
    }

    public String getCertifiedBy() {
        return certifiedBy;
    }

    public void setCertifiedBy(String certifiedBy) {
        this.certifiedBy = certifiedBy;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getMannerOfDeath() {
        return mannerOfDeath;
    }

    public void setMannerOfDeath(String mannerOfDeath) {
        this.mannerOfDeath = mannerOfDeath;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "DeathDto{" +
                "deceasedName='" + deceasedName + '\'' +
                ", causeOfDeath='" + causeOfDeath + '\'' +
                ", dateOfDeath=" + dateOfDeath +
                ", timeOfDeath=" + timeOfDeath +
                ", ageAtDeath=" + ageAtDeath +
                ", certifiedBy='" + certifiedBy + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", mannerOfDeath='" + mannerOfDeath + '\'' +
                ", gender='" + gender + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }
}
