package in.co.ipl.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.ipl.model.Frenchaices;
import in.co.ipl.model.Member;
import in.co.ipl.model.Person;
import in.co.ipl.model.Player;
import in.co.ipl.model.Team;

/**
 * Servlet implementation class TeamServlet
 */
public class TeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<Player> cskPlayerList = new ArrayList<Player>(); 
		cskPlayerList.add(new Player("Mahendra Singh", "Dhoni", 35,Person.Gender.MALE , "Ranchi",Player.role.Batsman, true,true, Frenchaices.CSK)); 
		cskPlayerList.add(new Player("Ambatti","Rayudu", 30,Person.Gender.MALE, "Guntur",Player.role.Batsman,false,false,Frenchaices.CSK));
		cskPlayerList.add(new Player("Ravindra", "Jadeja", 30,Person.Gender.MALE,"Navagam",Player.role.AllRounder,false,false,Frenchaices.CSK)); 
		cskPlayerList.add(new Player("Ravichandran"," Ashwin", 32,Person.Gender.MALE,"Chenni",Player.role.Bowler,false,false,Frenchaices.CSK));
				
		List<Member> cskStaffList = new ArrayList<Member>(); 
		
		cskStaffList.add(new Member("Stephen", "Fleming", 40, Person.Gender.MALE,"NZ",Member.role.Coach,Frenchaices.CSK)); 
		cskStaffList.add(new Member("Tommy", "Simsek", 45, Person.Gender.MALE, "NZ",Member.role.Physio,Frenchaices.CSK));
		
		Team team = new Team(Frenchaices.RCB , 200, 0.537, false, cskPlayerList, cskStaffList );
//		team.setTotalSix(200);
//		team.setTeamName(Frenchaices.CSK);
//		team.setNetRunRate(0.212);
//		team.setKnockOut(false);
		
		
		log(request.getParameter("name"));
		request.setAttribute("team", team);
		//request.setAttribute("team", cskPlayerList.toString());
		//request.setAttribute("team", cskStaffList.toString());
		request.getRequestDispatcher("/WEB-INF/team.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
