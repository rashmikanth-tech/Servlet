package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/fishee", loadOnStartup = 1)

public class FishServlet extends GenericServlet {
    public FishServlet(){
        System.out.println("Created Fish Servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("fishName");
        String color = servletRequest.getParameter("fishColor");
        String lifeSpan = servletRequest.getParameter("fishLifeSpan");
        String cost = servletRequest.getParameter("fishCost");
        String type = servletRequest.getParameter("fishType");
        String size = servletRequest.getParameter("fishSize");

        System.out.println("Name : "+name +"color : "+color +"LifeSpan : "+lifeSpan +"Cost : "+cost +"Type : "+type +"Size : "+size);

    }



}
