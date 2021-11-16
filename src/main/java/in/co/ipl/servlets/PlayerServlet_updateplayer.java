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

@WebServlet("/PlayerServlet_updateplayer")
public class PlayerServlet_updateplayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public PlayerServlet_updateplayer() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		request.getRequestDispatcher("/WEB-INF/jsp/updateplayer.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PlayerServiceImpl playerservice = new PlayerServiceImpl();
		Player player = new Player();
		
	    player.setFirstName(request.getParameter("firstname"));
	    player.setSecondName(request.getParameter("secondname"));
	    
	    playerservice.updatePlayer(player);
	    request.setAttribute("player", player);
	    request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
	}

}
