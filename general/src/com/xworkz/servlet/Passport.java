package com.xworkz.servlet;

import com.xworkz.dto.JobDto;
import com.xworkz.dto.PassportDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns ="/PassportApplicationServlet" ,loadOnStartup = 3)


public class Passport extends HttpServlet {
    public Passport() {
        System.out.println("Birth Servlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nameName = req.getParameter("nameName");
        String adharAdhar = req.getParameter("adharAdhar");
        String addressAdress = req.getParameter("addressAdress");
        String panPan = req.getParameter("panPan");
        String countryCountry = req.getParameter("countryCountry");
        String stateState = req.getParameter("stateState");
        String cityCity = req.getParameter("cityCity");
        String pinPin = req.getParameter("pinPin");
        String passPassport = req.getParameter("passPassport");
        String payRefrence = req.getParameter("payRefrence");

        double adhar = Double.parseDouble(adharAdhar);
        int pin = Integer.parseInt(pinPin);
        long ref = Long.parseLong(payRefrence);

        PassportDto passportDto = new PassportDto(nameName,adhar,addressAdress,panPan,countryCountry,stateState,cityCity,pin,passPassport,ref);
        System.out.println(passportDto);

//        JobDto jobDto = new JobDto();
//        jobDto.setNameName(nameName);
//        jobDto.setEmailEmail(emailEmail);
//        jobDto.setEduEducation(eduEducation);
//        jobDto.setSkillSkill(skillSkill);
//        jobDto.setSalarySalary(found);
//        jobDto.setExpExperiance(exp);





    }
}