package in.co.ipl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.co.ipl.dbaccess.JDBCAccessImp;
import in.co.ipl.model.Player;
import in.co.ipl.utils.Frenchaices;
import in.co.ipl.utils.Utils;



public class PlayerDAOImp implements PlayerDAO 
{
    JDBCAccessImp jdbc = new JDBCAccessImp();
	Connection connection = jdbc.getConnection();
	Utils utils = new Utils();
	
	
	final String INSERT_PLAYERS_SQL = "INSERT INTO players" 
	+ " (firstName, secondName, Age, gender, place, primaryRole, isCaptain, isWicketKeeper, franchasie)"
	+ " VALUES (?,?,?,?,?,?,?,?,?)";
	
	final String SELECTPLAYERS = "SELECT * FROM ipldb.players where franchasie= ?";
	
	final String SELECTBOWLER = "SELECT * FROM ipldb.players where primaryRole= ? and franchasie= ?";
	
	final String SELECT_PLAYER_BY_FIRSTNAME_SECONDNAME_TEAM = "SELECT * FROM ipldb.players where firstName=? and secondName=? and franchasie=?";
	
	final String SELECT_PLAYER_BY_ID = "SELECT * FROM ipldb.players where id=? ";
	
	final String SELECTBATSMAN = "SELECT * FROM ipldb.players where primaryRole= ? and franchasie= ?";
	
	final String DELETEPLAYER = "DELETE FROM ipldb.players where firstName= ? and franchasie= ?";
	
	final String UPDATEPLAYER = "UPDATE ipldb.players set firstName= ? where id=?";
	
	final String SELECT_PLAYER_BY_SECONDNAME = "SELECT * FROM ipldb.players where secondName = ? ";
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	@Override
	public void addPlayer(Player player) 
	{
		// TODO Auto-generated method stub
		int result = 0;
		//Class.forName("com.mysql.jdbc.Driver");
		
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PLAYERS_SQL);
			preparedStatement.setString(1, player.getFirstName());
			preparedStatement.setString(2, player.getSecondName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getGender().toString());
			preparedStatement.setString(5, player.getPlace());
			preparedStatement.setString(6, player.getPrimaryRole().toString());
			preparedStatement.setBoolean(7, player.isCaptain());
			preparedStatement.setBoolean(8, player.isWicketKeeper());
			preparedStatement.setString(9, player.getFranchaices().toString());
			
			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}	
	}

	private void printSQLException(SQLException ex)
	{
		for (Throwable e: ex)
		{
			if (e instanceof SQLException)
			{
			e.printStackTrace(System.err);
			System.err.println("SQLState: " + ((SQLException) e).getSQLState());
			System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
			System.err.println("Message: " + e.getMessage());
			Throwable t = ex.getCause();
			while (t != null)
			{
				System.out.println("Cause: " + t);
				t = t.getCause();
			}
			}		
		}
	}

	@Override
	public List<Player> getPlayersByTeam(String team) 
	{
		ResultSet result =null;
		List<Player> listOfPlayer = new ArrayList<Player>();
		
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECTPLAYERS);
			preparedStatement.setString(1, "RCB");
			
			System.out.println(preparedStatement);
			 result = preparedStatement.executeQuery();
			 while(result.next())
			 {
			 listOfPlayer.add(getPlayerFromResult(result));
			 }
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}

		return listOfPlayer;
		
	}

	@Override
	public List<Player> getBowlersByTeam(String team) 
	{
		ResultSet result =null;
		List<Player> listOfPlayer = new ArrayList<Player>();
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECTBOWLER);
			preparedStatement.setString(1, "Bowler");
			preparedStatement.setString(2, "RCB");
			
			System.out.println(preparedStatement);
			 result = preparedStatement.executeQuery();
			     while(result.next())
				 {
				 listOfPlayer.add(getPlayerFromResult(result));
				 }
			 
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}
		//System.out.println(result.toString());
		return listOfPlayer;
	}
	
	public  Player getPlayerFromResult(ResultSet result) 
	{
		Player resultPlayer = new Player();
		try {
			resultPlayer.setFirstName(result.getString(2));
			resultPlayer.setSecondName(result.getString(3));
			resultPlayer.setAge(result.getInt(4));
			resultPlayer.setGender(utils.findGenderByString(result.getString(5).toString()));
			resultPlayer.setPlace(result.getString(6));
			resultPlayer.setPrimaryRole(utils.findPlayerRoleByString(result.getString(7).toString()));
			resultPlayer.setCaptain(result.getBoolean(8));
			resultPlayer.setWicketKeeper(result.getBoolean(9));
			resultPlayer.setFranchaices(Frenchaices.getFranchaicesByString(result.getString(10).toString()));
			
			
			System.out.println(resultPlayer.toString());
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultPlayer;	
	}

	@Override
	public List<Player> getBatsmanByTeam(String team) {
		ResultSet result = null;
		List<Player> listOfPlayer = new ArrayList<Player>();
		Player player1 = null;
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECTBATSMAN);
			preparedStatement.setString(1, "Batsman");
			preparedStatement.setString(2, "RCB");
			
			
			System.out.println(preparedStatement);
			 result = preparedStatement.executeQuery();
			     while(result.next())
				 {
				 listOfPlayer.add(getPlayerFromResult(result));
//				 player1 = getPlayerFromResult(result);
//				 listOfPlayer.add(player1);
				 }
			 
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}		
          //System.out.println(result.toString());	
		return listOfPlayer;
	}

	

	@Override
	public void updatePlayer(Player player)
	{
		// TODO Auto-generated method stub
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(UPDATEPLAYER);
			preparedStatement.setString(1, "Ab");
			preparedStatement.setInt(2, 16);
			
			System.out.println(preparedStatement);
			int result = preparedStatement.executeUpdate();
			System.out.println(result + "Player record updated");

		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}	
		
	}

	@Override
	public void deletePlayer(Player player)
	{
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(DELETEPLAYER);
			preparedStatement.setString(1, "Ab");
			preparedStatement.setString(2, "RCB");
			
			System.out.println(preparedStatement);
			int result = preparedStatement.executeUpdate();
			
			System.out.println(result + "Player record deleted");

		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}	
		//System.out.println(result);
		
	}

	@Override
	public Player getPlayer(String fname, String lname, String team) 
	{
		ResultSet result;
		Player player = new Player();
		
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PLAYER_BY_FIRSTNAME_SECONDNAME_TEAM);
			preparedStatement.setString(1, "Ambatti");
			preparedStatement.setString(2, "Rayudu");
			preparedStatement.setString(3, "CSK");
			
			System.out.println(preparedStatement);
			result = preparedStatement.executeQuery();
			while(result.next())
		    {
				player = getPlayerFromResult(result);
               
		    }
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}
		//System.out.println(player.toString());
		return player;
	}

	@Override
	public Player getPlayerByID(int id)
	{
		ResultSet result = null;
		Player player = null;
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PLAYER_BY_ID);
			preparedStatement.setInt(1, 17);
			
			System.out.println(preparedStatement);
		    result = preparedStatement.executeQuery();
		    
		    while(result.next())
		    {
				player = getPlayerFromResult(result);
               
		    }
		    
		//	player.setFirstName(result.getString(1));		 
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}
		
		//System.out.println(player.toString());
		return player;
	}

	@Override
	public Player getPlayerBySecondName(String s) 
	{
		ResultSet result = null;
		Player player = null;
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PLAYER_BY_SECONDNAME);
			preparedStatement.setString(1, "Rayudu");
			
			System.out.println(preparedStatement);
		    result = preparedStatement.executeQuery();
		    
		    while(result.next())
		    {
				player = getPlayerFromResult(result);
               
		    }
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}
		
		//System.out.println(player.toString());
		return player;
	}

	

	

}
