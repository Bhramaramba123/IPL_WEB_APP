package in.co.ipl.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import in.co.ipl.model.Team;
import in.co.ipl.services.TeamServiceImpl;

public class DisplayTeamTag extends SimpleTagSupport
{
	String teamName ;
	int totalSix ;
    double netRunRate ;
    String var;
	
	public void setVar(String var) {
		this.var = var;
	}
public void setTeamName(String teamName) 
{
	this.teamName = teamName;
}
public void setTotalSix(int totalSix) 
{
	this.totalSix = totalSix;
}
public void setNetRunRate(double netRunRate) 
{
	this.netRunRate = netRunRate;
}

@Override
	public void doTag() throws JspException, IOException
    {
		 //System.out.println(teamName);
		 TeamServiceImpl teamservice = new TeamServiceImpl();
		 PageContext pageContext = (PageContext) getJspContext();
		 JspWriter out = pageContext.getOut();
		 Team team = teamservice.getTeamDetailsByName(teamName);
		 out.write("<ul> <li>Team Name:" + team.getTeamName() +
		 		 "</li> <li>Team Total six:"+ team.getTotalSix() +
		 		 "</li> <li>Team NetRunRate:"+ team.getNetRunRate() +"</li> </ul> ");
		//String result = "<ul> <li>Team Name: ${team.teamName}</li> <li>Team Total six: ${team.totalSix}</li> <li>Team NetRunRate: ${team.netRunRate}</li> </ul> "+
		 

		// "<h3>Players</h3> <ul> <c:forEach items = "${team.players}" var = "players" > <li> ${players} </li>      </c:forEach></ul> " + 
		 

		 //"<h3>Members</h3> <ul> <c:forEach var = "members" items = "${team.members}"  ><li> ${members}</li> </c:forEach></ul>";
		 
		// out.println(team);
		   
		   
    }	
}
