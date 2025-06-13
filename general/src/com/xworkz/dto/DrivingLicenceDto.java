package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class DrivingLicenceDto implements Serializable {

    private String personName;
    private String adessAdress;
    private long mobileNum;
    private LocalDate applayDate;
    private String vehiclVehicle;

    public DrivingLicenceDto() {
        System.out.println("Created Driving Licence Dto");
    }

    public DrivingLicenceDto(String nameName, String adessAdress, long mobileNum, LocalDate applayDate, String vehiclVehicle) {
        this.personName = nameName;
        this.adessAdress = adessAdress;
        this.mobileNum = mobileNum;
        this.applayDate = applayDate;
        this.vehiclVehicle = vehiclVehicle;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAdessAdress() {
        return adessAdress;
    }

    public void setAdessAdress(String adessAdress) {
        this.adessAdress = adessAdress;
    }

    public long getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(long mobileNum) {
        this.mobileNum = mobileNum;
    }

    public LocalDate getApplayDate() {
        return applayDate;
    }

    public void setApplayDate(LocalDate applayDate) {
        this.applayDate = applayDate;
    }

    public String getVehiclVehicle() {
        return vehiclVehicle;
    }

    public void setVehiclVehicle(String vehiclVehicle) {
        this.vehiclVehicle = vehiclVehicle;
    }

    @Override
    public String toString() {
        return "DrivingLicenceDto{" +
                "nameName='" + personName + '\'' +
                ", adessAdress='" + adessAdress + '\'' +
                ", mobileNum=" + mobileNum +
                ", applayDate=" + applayDate +
                ", vehiclVehicle='" + vehiclVehicle + '\'' +
                '}';
    }
}
