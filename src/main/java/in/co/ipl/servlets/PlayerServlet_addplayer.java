package in.co.ipl.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.ipl.model.Person;
import in.co.ipl.model.Person.Gender;
import in.co.ipl.model.Player;
import in.co.ipl.services.PlayerServiceImpl;
import in.co.ipl.utils.Frenchaices;
import in.co.ipl.utils.Utils;

@WebServlet("/PlayerServlet_addplayer")
public class PlayerServlet_addplayer extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    public PlayerServlet_addplayer() 
    {
        super();   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.getRequestDispatcher("/WEB-INF/jsp/addnewplayer.jsp").forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PlayerServiceImpl playerservice = new PlayerServiceImpl();
		Player player = new Player();
		Utils utils = new Utils();
		
		    player.setFirstName(request.getParameter("firstname"));
		    player.setSecondName(request.getParameter("lastname"));
		    player.setAge(Integer.parseInt(request.getParameter("age")));
		    player.setGender(utils.findGenderByString(request.getParameter("gender")));
		    player.setPlace(request.getParameter("place"));
		    player.setPrimaryRole(utils.findPlayerRoleByString(request.getParameter("primaryrole")));
		    if(request.getParameter("iscaptain") == "true")
		    {
		    	player.setCaptain(true);
		    }
		    else
		    {
		    	player.setCaptain(false);
		    }
		    if(request.getParameter("isWicketKeeper") == "true")
		    {
		    	player.setWicketKeeper(true);
		    }
		    else
		    {
		    	player.setWicketKeeper(false);
		    }
		    player.setFranchaices(Frenchaices.getFranchaicesByString(request.getParameter("teamname")));
		      
		    playerservice.addPlayer(player);
		    request.setAttribute("player", player);
		    request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);			
	}

}
