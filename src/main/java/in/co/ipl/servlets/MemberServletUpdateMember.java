package in.co.ipl.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.ipl.model.Member;
import in.co.ipl.services.MemberServiceImpl;

/**
 * Servlet implementation class MemberServletUpdateMember
 */
@WebServlet("/MemberServletUpdateMember")
public class MemberServletUpdateMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public MemberServletUpdateMember()
    
    {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		request.getRequestDispatcher("/WEB-INF/jsp/updatemember.jsp").forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		MemberServiceImpl memberservice = new MemberServiceImpl();
		Member member = new Member();
		
	    member.setFirstName(request.getParameter("firstname"));
	    member.setSecondName(request.getParameter("secondname"));
	    
	    memberservice.updateMember(member);
	    request.setAttribute("member", member);
	    request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
	}

}
