package in.co.ipl.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.ipl.model.Player;
import in.co.ipl.model.Team;
import in.co.ipl.utils.Frenchaices;

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
		
		
        req.setAttribute("set", Frenchaices.getShortnamesByFrenchaices());
        req.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(req, resp);

	}
	

	
}
