package in.co.ipl.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PlayerServlet")
public class PlayerServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    public PlayerServlet() 
    {
        super();   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		    String first_name = request.getParameter("first_name");
			String last_name = request.getParameter("last_name");
			String age = request.getParameter("age");
			String gender = request.getParameter("gender");
			String place = request.getParameter("place");
			String primaryrole = request.getParameter("primaryrole");
			String iscaptain = request.getParameter("iscaptain");
			String iswicketkeeper = request.getParameter("iswicketkeeper");
			String teamname = request.getParameter("teamname");
			
		doGet(request, response);
	}

}
