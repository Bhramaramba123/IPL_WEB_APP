package in.co.ipl.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.ipl.dao.UserDAO;
import in.co.ipl.model.UserBean;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/WEB-INF/jsp/loginpage.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		/*
		 * UserBean user = new UserBean(); user.setUsername(request.getParameter("un"));
		 * user.setPassword(request.getParameter("pw"));
		 * 
		 * user = UserDAO.login(user);
		 * 
		 * if (user.isValid()) {
		 * 
		 * HttpSession session = request.getSession(true);
		 * session.setAttribute("currentSessionUser",user);
		 * response.sendRedirect("/WEB-INF/jsp/userlogged.jsp"); //logged-in page }
		 * 
		 * else response.sendRedirect("src/main/webapp/WEB-INF/jsp/invalidlogin.jsp");
		 * //error page
		 */		
		
		String un=request.getParameter("username");
		String pw=request.getParameter("password");
		
		if(un.equals("admin") && pw.equals("admin"))
		{
			response.sendRedirect("userlogged.jsp");
			return;
		}
		else
		{
			response.sendRedirect("invalidlogin.jsp");
			return;
		}
	}

}
