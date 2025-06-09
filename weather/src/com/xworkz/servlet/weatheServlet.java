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
        String CapturedBy = servletRequest.getParameter("capturedname");
        String Temp = servletRequest.getParameter("tempname");
        String Record_Date = servletRequest.getParameter("datename");


        servletRequest.setAttribute("locationname",name);
        servletRequest.setAttribute("capturedname",CapturedBy);
        servletRequest.setAttribute("tempname",Temp);
        servletRequest.setAttribute("datename",Record_Date);


        LocalDate date =LocalDate.parse(Record_Date);


        WeatherDTO weatherDTO = new WeatherDTO();
        weatherDTO.setLocationname(name);
        weatherDTO.setCapturedname(CapturedBy);
        weatherDTO.setTempname(Temp);
        weatherDTO.setDatename(date);

        servletRequest.setAttribute("weather",weatherDTO);


        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("weatherResult.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);


    }
}
