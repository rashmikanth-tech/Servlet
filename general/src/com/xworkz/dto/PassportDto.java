package com.xworkz.dto;

import java.io.Serializable;

public class PassportDto implements Serializable {

    private String nameName;
    private double adharAdhar;
    private String addressAdress;
    private String panPan;
    private String countryCountry;
    private String stateState;
    private String cityCity;
    private int pinPin;
    private String passPassport;
    private long payRefrence;



    public PassportDto() {
        System.out.println("Implemented Passport Dto");
    }

    public PassportDto(String nameName, double adharAdhar, String addressAdress, String panPan, String countryCountry, String stateState, String cityCity, int pinPin, String passPassport, long payRefrence) {
        this.nameName = nameName;
        this.adharAdhar = adharAdhar;
        this.addressAdress = addressAdress;
        this.panPan = panPan;
        this.countryCountry = countryCountry;
        this.stateState = stateState;
        this.cityCity = cityCity;
        this.pinPin = pinPin;
        this.passPassport = passPassport;
        this.payRefrence = payRefrence;
    }

    public String getNameName() {
        return nameName;
    }

    public void setNameName(String nameName) {
        this.nameName = nameName;
    }

    public double getAdharAdhar() {
        return adharAdhar;
    }

    public void setAdharAdhar(double adharAdhar) {
        this.adharAdhar = adharAdhar;
    }

    public String getAddressAdress() {
        return addressAdress;
    }

    public void setAddressAdress(String addressAdress) {
        this.addressAdress = addressAdress;
    }

    public String getPanPan() {
        return panPan;
    }

    public void setPanPan(String panPan) {
        this.panPan = panPan;
    }

    public String getCountryCountry() {
        return countryCountry;
    }

    public void setCountryCountry(String countryCountry) {
        this.countryCountry = countryCountry;
    }

    public String getStateState() {
        return stateState;
    }

    public void setStateState(String stateState) {
        this.stateState = stateState;
    }

    public String getCityCity() {
        return cityCity;
    }

    public void setCityCity(String cityCity) {
        this.cityCity = cityCity;
    }

    public int getPinPin() {
        return pinPin;
    }

    public void setPinPin(int pinPin) {
        this.pinPin = pinPin;
    }

    public String getPassPassport() {
        return passPassport;
    }

    public void setPassPassport(String passPassport) {
        this.passPassport = passPassport;
    }

    public long getPayRefrence() {
        return payRefrence;
    }

    public void setPayRefrence(long payRefrence) {
        this.payRefrence = payRefrence;
    }

    @Override
    public String toString() {
        return "PassportDto{" +
                "nameName='" + nameName + '\'' +
                ", adharAdhar=" + adharAdhar +
                ", addressAdress='" + addressAdress + '\'' +
                ", panPan='" + panPan + '\'' +
                ", countryCountry='" + countryCountry + '\'' +
                ", stateState='" + stateState + '\'' +
                ", cityCity='" + cityCity + '\'' +
                ", pinPin=" + pinPin +
                ", passPassport='" + passPassport + '\'' +
                ", payRefrence=" + payRefrence +
                '}';
    }
}
