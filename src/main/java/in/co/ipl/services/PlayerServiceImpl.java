package in.co.ipl.services;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.co.ipl.dao.PlayerDAOImp;
import in.co.ipl.model.Player;
import in.co.ipl.utils.Frenchaices;


public class PlayerServiceImpl implements PlayerService
{
	
    public List<Player> playerList = new ArrayList<Player>();
    PlayerDAOImp playerDAO = new PlayerDAOImp();

	public List<Player> getPlayerList() 
	{
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) 
	{
		this.playerList = playerList;
	}

	public PlayerServiceImpl(List<Player> playerList) 
	{
		super();
		this.playerList = playerList;
	}

	public PlayerServiceImpl()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		String PlayerDetails="";
		for(Player player: playerList)
		{
		PlayerDetails = PlayerDetails.concat(player.toString());
		PlayerDetails = PlayerDetails.concat(System.lineSeparator());
		}
		return PlayerDetails;
	}

	public List<Player> getPlayersByTeam(Frenchaices f)
	{
		// TODO Auto-generated method stub
		List<Player> subPlayersList = new ArrayList<Player>();
		//PlayerServiceImpl subPlayers = new PlayerServiceImpl();
		for (Player p: getPlayerList()) 
		{	
		     if(p.getFranchaices() == f)
		     {
			subPlayersList.add(p);
		     }
		}
		//subPlayers.setPlayerList(subPlayersList);
		return subPlayersList;
	}
	public void addPlayer(Player player)
	{
		// TODO Auto-generated method stub
		//playerList.add(player);	
		playerDAO.addPlayer(player);
	}
    @Override
	public void removePlayer(Player player) 
	{
		// TODO Auto-generated method stub
		playerDAO.deletePlayer(player);
		//playerList.remove(player);
		System.out.println(toString());
	}
	@Override
	public void updatePlayer(Player player) 
	{
		// TODO Auto-generated method stub
		playerDAO.updatePlayer(player);	
	}
	@Override
	public void removePlayerBySecondName(String s) 
	{
		// TODO Auto-generated method stub
		Player deletePlayer = getPlayerBySecondName(s);
		System.out.println("delete player " + deletePlayer.toString());
		removePlayer(deletePlayer);
	}
	@Override
	public Player getPlayerBySecondName(String s)
	{
//		for(Player p1 : getPlayerList())
//		{	
//		 if(p1.getSecondName().trim().equals(s.trim()))
//	      {
//				 return p1;
//	      }
//	         
//		}
		Player player = getPlayerBySecondName(s);
		return player;
	}
	@Override
	public List<Player> getBowlersByTeam(String team)
	{
		// TODO Auto-generated method stub
		//String teamName = "RCB";
		List<Player> player = getBowlersByTeam("RCB");
		return player;
	}
	@Override
	public List<Player> getBatsmanByTeam(String team) 
	{
		// TODO Auto-generated method stub
        List<Player> player = getBatsmanByTeam("RCB");	
		return player;	
	}
}
