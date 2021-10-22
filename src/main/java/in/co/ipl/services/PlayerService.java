package in.co.ipl.services;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import in.co.ipl.model.Player;
import in.co.ipl.utils.Frenchaices;

public interface PlayerService
{
	public void addPlayer(Player player);
	public void removePlayer(Player player);
	public void updatePlayer(Player player);
	
	public void removePlayerBySecondName(String s);
	public List<Player> getPlayersByTeam(Frenchaices f);
	public List<Player> getBowlersByTeam(String team);
	public List<Player> getBatsmanByTeam(String team);
	public Player getPlayerBySecondName(String s);
	
}
