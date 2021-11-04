package in.co.ipl.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	public HomeServlet()
    {
        super();
    }
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//super.doGet(req, resp);
		req.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(req, resp);
		
		
	}
	

	
}
