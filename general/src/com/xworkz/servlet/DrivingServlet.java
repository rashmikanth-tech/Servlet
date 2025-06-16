package com.xworkz.servlet;

import com.xworkz.dto.DrivingLicenceDto;
import com.xworkz.service.DrivingLicenceService;
import com.xworkz.service.LicenceImplement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;

@WebServlet(urlPatterns = "/DrivingServlet",loadOnStartup = 5)
public class DrivingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String Name = req.getParameter("personName");
        if (Name == null) {
            System.out.println("eneter name");
        }
        String adessAdress = req.getParameter("adessAdress");
        String mobileNum = req.getParameter("mobileNum");
        String applayDate = req.getParameter("applayDate");
        String vehicle = req.getParameter("vehiclVehicle");

        //convert data type
        long number = Long.parseLong(mobileNum);
        LocalDate date = LocalDate.parse(applayDate);

        DrivingLicenceDto drivingLicenceDto = new DrivingLicenceDto(Name, adessAdress, number, date, vehicle);
//
//        req.setAttribute("drive",drivingLicenceDto);
        DrivingLicenceService drivingLicenceService = new LicenceImplement();
        String check = drivingLicenceService.validate(drivingLicenceDto);


    }
}
