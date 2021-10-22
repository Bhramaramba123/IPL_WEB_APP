package in.co.ipl.services;

import java.util.List;

import in.co.ipl.model.Team;
import in.co.ipl.utils.Frenchaices;

public interface TeamService 
{
	public void addTeam(Team team);

	List<Team> getAllTeamDetails(Frenchaices f);
	Team getTeamDetailsByName(String teamName);

}
