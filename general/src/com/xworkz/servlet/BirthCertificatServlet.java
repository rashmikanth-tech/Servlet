package com.xworkz.servlet;

import com.xworkz.dto.BirthCertificatDto;
import com.xworkz.service.BirthCertificateService;
import com.xworkz.service.BirthImplement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@WebServlet(urlPatterns ="/BirthApplicationServlet" ,loadOnStartup =2)

public class BirthCertificatServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String birthBirthId = req.getParameter("birthBirthId");
        String hospitalName = req.getParameter("hospitalName");
        String fatherName = req.getParameter("fatherName");
        String motherName = req.getParameter("motherName");
        String dateAndTime = req.getParameter("dateAndTime");
        String doctorName = req.getParameter("doctorName");
        String nurseName =req.getParameter("nurseName");
        String hospitalType = req.getParameter("hospitalType");

        LocalDateTime date = LocalDateTime.parse(dateAndTime);



        BirthCertificatDto birthCertificatDto = new BirthCertificatDto();
        birthCertificatDto.setBirthBirthId(birthBirthId);
        birthCertificatDto.setHospitalName(hospitalName);
        birthCertificatDto.setFatherName(fatherName);
        birthCertificatDto.setMotherName(motherName);
        birthCertificatDto.setDateAndTime(date);
        birthCertificatDto.setDoctorName(doctorName);
        birthCertificatDto.setNurseName(nurseName);
        birthCertificatDto.setHospitalType(hospitalType);



        BirthCertificateService birthCertificateService = new BirthImplement();
        birthCertificateService.birthValidate(birthCertificatDto);

        req.setAttribute("birth",birthCertificatDto);

        RequestDispatcher requestDispatcher= req.getRequestDispatcher("BirthResult.jsp");
        requestDispatcher.forward(req,resp);
    }
}
