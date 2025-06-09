package com.xworkz.servlet;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class WeatherDTO implements Serializable {

    private String locationname;
    private String capturedname;
    private String tempname;
    private LocalDate datename;

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    public String getCapturedname() {
        return capturedname;
    }

    public void setCapturedname(String capturedname) {
        this.capturedname = capturedname;
    }

    public String getTempname() {
        return tempname;
    }

    public void setTempname(String tempname) {
        this.tempname = tempname;
    }

    public LocalDate getDatename() {
        return datename;
    }

    public void setDatename(LocalDate datename) {
        this.datename = datename;
    }
}
