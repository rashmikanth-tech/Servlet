package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class BirthCertificatDto implements Serializable {

    private String birthBirthId;
    private String fatherName;
    private String motherName;
    private LocalDateTime dateAndTime;
    private String doctorName;
    private String nurseName;
    private String hospitalName;
    private String hospitalType;

    public BirthCertificatDto() {
        System.out.println("Birth Certificate Dto");
    }

    public BirthCertificatDto(String birthBirthId, String fatherName, String motherName, LocalDateTime dateAndTime, String doctorName, String nurseName, String hospitalName, String hospitalType) {
        this.birthBirthId = birthBirthId;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.dateAndTime = dateAndTime;
        this.doctorName = doctorName;
        this.nurseName = nurseName;
        this.hospitalName = hospitalName;
        this.hospitalType = hospitalType;
    }

    public String getBirthBirthId() {
        return birthBirthId;
    }

    public void setBirthBirthId(String birthBirthId) {
        this.birthBirthId = birthBirthId;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }

    @Override
    public String toString() {
        return "BirthCertificatDto{" +
                "birthBirthId=" + birthBirthId +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", dateAndTime=" + dateAndTime +
                ", doctorName='" + doctorName + '\'' +
                ", nurseName='" + nurseName + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalType='" + hospitalType + '\'' +
                '}';
    }
}
