package in.co.ipl.dao;

import java.util.List;

import in.co.ipl.model.Team;
public interface TeamDAO 
{
	void addTeam(Team team) ;
	Team getTeamDetails(String team);


}
