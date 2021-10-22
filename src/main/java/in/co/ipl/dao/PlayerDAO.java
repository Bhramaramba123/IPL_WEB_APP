package in.co.ipl.dao;

import java.util.List;

import in.co.ipl.model.Player;

public interface PlayerDAO 
{
	public void addPlayer(Player player);
	void deletePlayer(Player player);
	void updatePlayer(Player player);
	
	Player getPlayer(String fname, String lname, String team);
	
	Player getPlayerByID(int id);
	List<Player> getPlayersByTeam(String team);
	List<Player> getBowlersByTeam(String team);
	List<Player> getBatsmanByTeam(String team);
	Player getPlayerBySecondName(String s);
	
}
