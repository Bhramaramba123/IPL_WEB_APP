package in.co.ipl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.co.ipl.dbaccess.JDBCAccessImp;
import in.co.ipl.model.Team;
import in.co.ipl.utils.Frenchaices;
import in.co.ipl.utils.Utils;

public class TeamDAOImpl implements TeamDAO 
{
	JDBCAccessImp jdbc = new JDBCAccessImp();
	Connection connection = jdbc.getConnection();
	Utils utils = new Utils();
	
	final String INSERT_TEAM_SQL = "INSERT INTO ipldb.teams (totalSix, netRunRate, isKnockOut, franchasie) VALUES (?,?,?,?)";
	
	final String SELECTTEAM = "SELECT * FROM ipldb.teams where franchasie= ?";

	@Override
	public void addTeam(Team team) 
	{
		int result = 0;		
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TEAM_SQL);
			preparedStatement.setInt(1, team.getTotalSix());
			preparedStatement.setDouble(2, team.getNetRunRate());
			preparedStatement.setBoolean(3, team.isKnockOut());
			preparedStatement.setString(4, team.getTeamName().toString());
			
			
			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}	
		
	}
	private void printSQLException(SQLException ex) {
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
	public Team getTeamDetails(String team) 
	{
		ResultSet result =null;
		//List<Team> teamResult = new ArrayList<Team>();
		
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECTTEAM);
			preparedStatement.setString(1, team);
			
			System.out.println(preparedStatement);
			result = preparedStatement.executeQuery();	
			
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}
		 return getTeamFromResult(result);


	}

	public  Team getTeamFromResult(ResultSet result) 
	{
		Team teamDetails = new Team();
		try {
			 while(result.next())
			 {
				 teamDetails.setTotalSix(result.getInt("totalSix"));
					teamDetails.setNetRunRate(result.getDouble("netRunRate"));
					teamDetails.setKnockOut(result.getBoolean("isKnockOut"));
					teamDetails.setTeamName(Frenchaices.getFranchaicesByString(result.getString("franchasie")));
			 }
//		    teamDetails.setTotalSix(result.getInt("totalSix"));
//			teamDetails.setNetRunRate(result.getDouble("netRunRate"));
//			teamDetails.setKnockOut(result.getBoolean("isKnockOut"));
//			teamDetails.setTeamName(Frenchaices.getFranchaicesByString(result.getString("franchasie")));
			
			
			
			//System.out.println(teamDetails.toString());
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teamDetails;	
	}
	

	

}
