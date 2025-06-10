package com.xworkz.servlet;

import com.xworkz.dto.JobDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/JobApplicationServlet",loadOnStartup = 5)

public class JobServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        String nameName = req.getParameter("nameName");
        String emailEmail = req.getParameter("emailEmail");
        String eduEducation = req.getParameter("eduEducation");
        String skillSkill = req.getParameter("skillSkill");
        String salarySalary = req.getParameter("salarySalary");
        String expExperiance = req.getParameter("expExperiance");

        double found = Double.parseDouble(salarySalary);
        int exp = Integer.parseInt(expExperiance);

        JobDto jobDto = new JobDto();
        jobDto.setNameName(nameName);
        jobDto.setEmailEmail(emailEmail);
        jobDto.setEduEducation(eduEducation);
        jobDto.setSkillSkill(skillSkill);
        jobDto.setSalarySalary(found);
        jobDto.setExpExperiance(exp);

        req.setAttribute("getjob",jobDto);

        RequestDispatcher requestDispatcher= req.getRequestDispatcher("jobresult.jsp");
        requestDispatcher.forward(req,resp);

    }


}
