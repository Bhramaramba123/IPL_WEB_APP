package in.co.ipl.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.ipl.services.DataInitializationImpl;
import in.co.ipl.services.TeamServiceImpl;

@WebServlet("/addplayertoDB")
public class addplayertoDB extends HttpServlet
{
	private static final long serialVersionUID = 1L;
   
    public addplayertoDB() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
         DataInitializationImpl DI = new DataInitializationImpl();
	     TeamServiceImpl t1 = DI.readTeamDataFromFile();
	    
		request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
	}

}
