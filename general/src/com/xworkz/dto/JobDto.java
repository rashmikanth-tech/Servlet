package com.xworkz.dto;

import java.io.Serializable;

public class JobDto implements Serializable {

    private String nameName;
    private String emailEmail;
    private String eduEducation;
    private String skillSkill;
    private double salarySalary;
    private int expExperiance;

    public JobDto() {
        System.out.println("Job dto");
    }

    public JobDto(String nameName, String emailEmail, String eduEducation, String skillSkill, double salarySalary, int expExperiance) {
        this.nameName = nameName;
        this.emailEmail = emailEmail;
        this.eduEducation = eduEducation;
        this.skillSkill = skillSkill;
        this.salarySalary = salarySalary;
        this.expExperiance = expExperiance;
    }

    public String getNameName() {
        return nameName;
    }

    public void setNameName(String nameName) {
        this.nameName = nameName;
    }

    public String getEmailEmail() {
        return emailEmail;
    }

    public void setEmailEmail(String emailEmail) {
        this.emailEmail = emailEmail;
    }

    public String getEduEducation() {
        return eduEducation;
    }

    public void setEduEducation(String eduEducation) {
        this.eduEducation = eduEducation;
    }

    public String getSkillSkill() {
        return skillSkill;
    }

    public void setSkillSkill(String skillSkill) {
        this.skillSkill = skillSkill;
    }

    public double getSalarySalary() {
        return salarySalary;
    }

    public void setSalarySalary(double salarySalary) {
        this.salarySalary = salarySalary;
    }

    public int getExpExperiance() {
        return expExperiance;
    }

    public void setExpExperiance(int expExperiance) {
        this.expExperiance = expExperiance;
    }

    @Override
    public String toString() {
        return "JobDto{" +
                "nameName='" + nameName + '\'' +
                ", emailEmail='" + emailEmail + '\'' +
                ", eduEducation='" + eduEducation + '\'' +
                ", skillSkill='" + skillSkill + '\'' +
                ", salarySalary=" + salarySalary +
                ", expExperiance=" + expExperiance +
                '}';
    }
}
