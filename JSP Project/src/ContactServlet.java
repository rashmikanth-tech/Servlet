import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/contact",loadOnStartup = 2)

public class ContactServlet extends GenericServlet {

    public ContactServlet(){
        System.out.println("Contact servlet crrated by tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(("running server in contactservlet"));

        String Name = servletRequest.getParameter("nameName");
        String Age = servletRequest.getParameter("ageAge");
        String Email = servletRequest.getParameter("emailEmail");
        System.out.println("Name : "+Name+ "Age : "+ Age+ "Email : "+Email);


        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("Contactresult.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
