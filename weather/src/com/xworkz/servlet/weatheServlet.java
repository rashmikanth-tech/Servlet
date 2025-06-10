package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/weather",loadOnStartup = 1)

public class weatheServlet extends GenericServlet {

    public  weatheServlet(){
        System.out.println("Weather Servlet Created");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {


        String name = servletRequest.getParameter("locationname");
        String capturedBy = servletRequest.getParameter("capturedname");
        String temp = servletRequest.getParameter("tempname");
        String recordDate = servletRequest.getParameter("datename");




        LocalDate date =LocalDate.parse(recordDate);


        WeatherDTO weatherDTO = new WeatherDTO();
       weatherDTO.setLocationName(name);
       weatherDTO.setCapturedName(capturedBy);
       weatherDTO.setTempName(temp);
       weatherDTO.setDateName(date);

        servletRequest.setAttribute("weather",weatherDTO);


        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("weatherResult.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);


    }
}
