package in.co.ipl.services;

import java.util.ArrayList;
import java.util.List;

import in.co.ipl.dao.TeamDAOImpl;
import in.co.ipl.model.Team;
import in.co.ipl.utils.Frenchaices;

public class TeamServiceImpl implements TeamService
{

	public static List<Team> TeamList = new ArrayList<Team>();
    TeamDAOImpl teamDAO = new TeamDAOImpl();
  

    
	public List<Team> getTeamList() {
		return TeamList;
	}

	public void setTeamList(List<Team> TeamList) {
		this.TeamList = TeamList;
	}

	public  TeamServiceImpl(List<Team> TeamList) {
		super();
		this.TeamList = TeamList;
	}

	public TeamServiceImpl()
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
	
	public void addTeam(Team team)
	{
		teamDAO.addTeam(team);	
	}
	
	@Override
	public List<Team> getAllTeamDetails(Frenchaices f)
	{
		List<Team> TeamDetails = new ArrayList<Team>();
		//PlayerServiceImpl subPlayers = new PlayerServiceImpl();
		for (Team t: getTeamList()) 
		{	
		     if(t.getTeamName() == f)
		     {
			TeamDetails.add(t);
		     }
		}
		//subPlayers.setPlayerList(subPlayersList);
		return TeamDetails;
	}


	
	@Override
	public Team getTeamDetailsByName(String teamName)
	{
		MemberServiceImpl memberService = new MemberServiceImpl();
		PlayerServiceImpl playerService = new PlayerServiceImpl();
		
		Team team = teamDAO.getTeamDetails(teamName);
		//team.setPlayers(playerService.getPlayersByTeam(Frenchaices.getFranchaicesByString(teamName)));
		team.setPlayers(playerService.getPlayersByTeam(teamName));
		team.setMembers(memberService.getMembersByTeam(teamName));	
		
		
		return team;
	}

	

	
	

	
}
