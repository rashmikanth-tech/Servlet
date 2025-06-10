package com.xworkz.servlet;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class WeatherDTO implements Serializable {

    private String locationName;
    private String capturedName;
    private String tempName;
    private LocalDate dateName;


    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getCapturedName() {
        return capturedName;
    }

    public void setCapturedName(String capturedName) {
        this.capturedName = capturedName;
    }

    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    public LocalDate getDateName() {
        return dateName;
    }

    public void setDateName(LocalDate dateName) {
        this.dateName = dateName;
    }
}