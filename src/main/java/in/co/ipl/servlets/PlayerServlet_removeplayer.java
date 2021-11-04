package in.co.ipl.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.ipl.model.Player;
import in.co.ipl.services.PlayerServiceImpl;
import in.co.ipl.utils.Utils;


@WebServlet("/PlayerServlet_removeplayer")
public class PlayerServlet_removeplayer extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    public PlayerServlet_removeplayer()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		request.getRequestDispatcher("/WEB-INF/jsp/deleteplayer.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PlayerServiceImpl playerservice = new PlayerServiceImpl();
		Player player = new Player();
		Utils utils = new Utils();
		
		
	    player.setFirstName(request.getParameter("firstname"));
	    
	    playerservice.removePlayer(player);
	    request.setAttribute("player", player);
	    request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
	}

}
