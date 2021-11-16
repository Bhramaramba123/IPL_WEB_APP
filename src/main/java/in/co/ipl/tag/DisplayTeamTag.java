package in.co.ipl.tag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import in.co.ipl.model.Member;
import in.co.ipl.model.Player;
import in.co.ipl.model.Team;
import in.co.ipl.services.TeamServiceImpl;
import in.co.ipl.utils.Frenchaices;

public class DisplayTeamTag extends SimpleTagSupport
{
	String teamName ;
	int totalSix ;
    double netRunRate ;
    String var;
	Boolean basic;
	
public void setVar(String var) 
{
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
public void setBasic(Boolean basic) {
	this.basic = basic;
}



@Override
	public void doTag() throws JspException, IOException
    {
		 //System.out.println(teamName);
		 TeamServiceImpl teamservice = new TeamServiceImpl();
		 PageContext pageContext = (PageContext) getJspContext();
		 JspWriter out = pageContext.getOut();
		 //Map<String, String> teamDetails = new HashMap<>();
	        //Set<String> data = new LinkedHashSet<String>();   
            //data = Frenchaices.getShortnamesByFrenchaices();
	        //Iterator<String> newData = data.iterator();  

			Team team = teamservice.getTeamDetailsByName(teamName);
			    if(this.var != null) 
			    { 
				   if(this.basic == true) 
				   { 
					  pageContext.setAttribute(var,getDetails(team));
				   } 
				   else
				   { 
					  pageContext.setAttribute(var, team);
			       }
				 } 
			     else
			     {
			  
			  out.write("<ul> <li>Team Name:" + team.getTeamName() +
			  "</li> <li>Team Total six:"+ team.getTotalSix() +
			  "</li> <li>Team NetRunRate:"+ team.getNetRunRate() +"</li> </ul> "); 
			     }
		
			

    }

public String getCaptainName(Team team)	
{
	//String name = null ;
	for(Player p: team.getPlayers())
	{
		if(p.isCaptain())
			return p.getFullName();
	}
	return null;
}
public String getCoachName(Team team)	
{
	for(Member m: team.getMembers())
	{
		if(Member.role.Coach == m.getRole())
			return m.getFullName();
			
	}
	return null;
}
public String getPlace(Team team)	
{
			return team.getTeamName().city;
	
}
public Map<String, String> getDetails(Team team)
{
	 Map<String , String> teamDetails = new HashMap<>();
	 
 teamDetails.put("teamName", team.getTeamName().Name);
 teamDetails.put("CaptainName", getCaptainName(team));
 teamDetails.put("PlaceName", getPlace(team));
 teamDetails.put("CoachName", getCoachName(team));
 teamDetails.put("Shortname", team.getTeamName().Shortname);
 // System.out.println(teamDetails);
 return teamDetails;

}
}