package in.co.ipl.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import in.co.ipl.utils.Frenchaices;



public class Teams 
{
	
    public static List<Team> TeamList = new ArrayList<Team>();
    
    //Frenchaices f = new Frenchaices();

	public List<Team> getTeamList() {
		return TeamList;
	}

	public void setTeamList(List<Team> TeamList) {
		this.TeamList = TeamList;
	}

	public Teams(List<Team> TeamList) {
		super();
		this.TeamList = TeamList;
	}

	public Teams()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		String TeamDetails="";
		for(Team Team: TeamList)
		{
		TeamDetails = TeamDetails.concat(Team.toString());
		TeamDetails = TeamDetails.concat(System.lineSeparator());
		}
		return TeamDetails;
	}

	public void addTeam(Team team) {
		// TODO Auto-generated method stub
		TeamList.add(team);
		
	}
	public Teams getTeamByName(Frenchaices f)
	{
		List<Team> teamDetails = new ArrayList<Team>();
		Teams teams = new Teams();
		for (Team t: TeamList) 
		{	
		     if(t.getTeamName() == f)
		     {
		     	teamDetails.add(t);
		     }	
		}
		teams.setTeamList(teamDetails);
		
		return teams;
		
	}
	
	

	
	

}
