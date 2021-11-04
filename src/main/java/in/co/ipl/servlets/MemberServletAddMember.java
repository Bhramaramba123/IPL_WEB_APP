package in.co.ipl.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.ipl.model.Member;
import in.co.ipl.model.Player;
import in.co.ipl.services.MemberServiceImpl;
import in.co.ipl.services.PlayerServiceImpl;
import in.co.ipl.utils.Frenchaices;
import in.co.ipl.utils.Utils;

@WebServlet("/MemberServletAddMember")
public class MemberServletAddMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public MemberServletAddMember()
    {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.getRequestDispatcher("/WEB-INF/jsp/addnewmember.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		MemberServiceImpl memberservice = new MemberServiceImpl();
		Member member = new Member();
		Utils utils = new Utils();
		
		    member.setFirstName(request.getParameter("firstname"));
		    member.setSecondName(request.getParameter("lastname"));
		    member.setAge(Integer.parseInt(request.getParameter("age")));
		    member.setGender(utils.findGenderByString(request.getParameter("gender")));
		    member.setPlace(request.getParameter("place"));
		    member.setRole(utils.findMemberRoleByString(request.getParameter("role")));	    
		    member.setFrenchaices(Frenchaices.getFranchaicesByString(request.getParameter("teamname")));
		    
		    memberservice.addMember(member);
		    request.setAttribute("member", member);
		    request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
	}

}
