package com.xworkz.servlet;

import com.xworkz.dto.DeathDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/DeathCertificateServlet",loadOnStartup = 4)

public class DeathServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException {

        String deceasedName = req.getParameter("deceasedName");
        String causeOfDeath = req.getParameter("causeOfDeath");
        String dateOfDeathStr = req.getParameter("dateOfDeath");
        String timeOfDeathStr = req.getParameter("timeOfDeath");
        String ageAtDeathStr = req.getParameter("ageAtDeath");
        String certifiedBy = req.getParameter("certifiedBy");
        String hospitalName = req.getParameter("hospitalName");
        String mannerOfDeath = req.getParameter("mannerOfDeath");
        String gender = req.getParameter("gender");
        String marks = req.getParameter("marks");

        // Parse types
        LocalDate dateOfDeath = LocalDate.parse(dateOfDeathStr);
        Time timeOfDeath = Time.valueOf(timeOfDeathStr + ":00"); // add seconds
        int ageAtDeath = Integer.parseInt(ageAtDeathStr);

        // Create DTO
        DeathDto deathDto = new DeathDto(
                deceasedName, causeOfDeath, dateOfDeath, timeOfDeath,
                ageAtDeath, certifiedBy, hospitalName, mannerOfDeath, gender, marks
        );

        System.out.println(deathDto);
    }
}