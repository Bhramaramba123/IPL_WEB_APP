package in.co.ipl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.co.ipl.dbaccess.JDBCAccessImp;
import in.co.ipl.model.Member;
import in.co.ipl.utils.Frenchaices;
import in.co.ipl.utils.Utils;

public class MemberDAOImp implements MemberDAO
{

    JDBCAccessImp jdbc = new JDBCAccessImp();
	Connection connection = jdbc.getConnection();
	Utils utils = new Utils();
	
	
	final String INSERT_MEMBERS_SQL = "INSERT INTO ipldb.members (FName, LName, age, gender, place, role, franchasie) VALUES (?,?,?,?,?,?,?)";
	
	final String SELECTMEMBERS = "SELECT * FROM ipldb.members where franchasie= ?";
	
	final String SELECTCOACH = "SELECT * FROM ipldb.members where role= ? and franchasie= ?";
	
	final String SELECT_MEMBER_BY_FNAME_LNAME_TEAM = "SELECT * FROM ipldb.members where FName=? and LName=? and franchasie=?";
	
	final String SELECT_MEMBER_BY_ID = "SELECT * FROM ipldb.members where id=? ";
	
	final String SELECTPHYSIO = "SELECT * FROM ipldb.members where role= ? and franchasie= ?";
	
	final String DELETEMEMBER = "DELETE FROM ipldb.members where FName= ? and franchasie= ?";
	
	final String UPDATEMEMBER = "UPDATE ipldb.members set FName= ? where id=?";
	
	final String SELECT_MEMBER_BY_LNAME = "SELECT * FROM ipldb.members where LName = ? ";
	
	//-----------------------------------------------------------------------------------------------------------------------------------

	
	@Override
	public void addMember(Member member) 
	{
		int result = 0;
		
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MEMBERS_SQL);
			preparedStatement.setString(1, member.getFirstName());
			preparedStatement.setString(2, member.getSecondName());
			preparedStatement.setInt(3, member.getAge());
			preparedStatement.setString(4, member.getGender().toString());
			preparedStatement.setString(5, member.getPlace());
			preparedStatement.setString(6, member.getRole().toString());
			preparedStatement.setString(7, member.getFrenchaices().toString());
			
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
	public List<Member> getMembersByTeam(String team) 
	{
		ResultSet result =null;
		List<Member> listOfMember = new ArrayList<Member>();
		
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECTMEMBERS);
			preparedStatement.setString(1, "RCB");
			
			System.out.println(preparedStatement);
			 result = preparedStatement.executeQuery();
			 while(result.next())
			 {
			 listOfMember.add(getMemberFromResult(result));
			 }
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}

		return listOfMember;
		
	}

	@Override
	public List<Member> getCoachByTeam(String team) 
	{
		ResultSet result =null;
		List<Member> listOfMember = new ArrayList<Member>();
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECTCOACH);
			preparedStatement.setString(1, "Coach");
			preparedStatement.setString(2, "RCB");
			
			System.out.println(preparedStatement);
			 result = preparedStatement.executeQuery();
			     while(result.next())
				 {
				 listOfMember.add(getMemberFromResult(result));
				 }
			 
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}
		//System.out.println(result.toString());
		return listOfMember;
	}
	
	public  Member getMemberFromResult(ResultSet result) 
	{
		Member resultMember = new Member();
		try {
			resultMember.setFirstName(result.getString(2));
			resultMember.setSecondName(result.getString(3));
			resultMember.setAge(result.getInt(4));
			resultMember.setGender(utils.findGenderByString(result.getString(5).toString()));
			resultMember.setPlace(result.getString(6));
			resultMember.setRole(utils.findMemberRoleByString(result.getString(7).toString()));
			resultMember.setFrenchaices(Frenchaices.getFranchaicesByString(result.getString(8).toString()));
			
			
			System.out.println(resultMember.toString());
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultMember;	
	}

	@Override
	public List<Member> getPhysioByTeam(String team) {
		ResultSet result = null;
		List<Member> listOfmember = new ArrayList<Member>();
		//Member member1 = null;
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECTPHYSIO);
			preparedStatement.setString(1, "Physio");
			preparedStatement.setString(2, "RCB");
			
			
			System.out.println(preparedStatement);
			 result = preparedStatement.executeQuery();
			     while(result.next())
				 {
				 listOfmember.add(getMemberFromResult(result));
//				 player1 = getPlayerFromResult(result);
//				 listOfPlayer.add(player1);
				 }
			 
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}		
          //System.out.println(result.toString());	
		return listOfmember;
	}

	

	@Override
	public void updateMember(Member member)
	{
		// TODO Auto-generated method stub
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(UPDATEMEMBER);
			preparedStatement.setString(1, "Ab");
			preparedStatement.setInt(2, 1);
			
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
	public void deleteMember(Member member)
	{
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(DELETEMEMBER);
			preparedStatement.setString(1, "Ab");
			preparedStatement.setString(2, "RCB");
			
			System.out.println(preparedStatement);
			int result = preparedStatement.executeUpdate();
			
			System.out.println(result + "member record deleted");

		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}	
		//System.out.println(result);
		
	}

	@Override
	public Member getMember(String fname, String lname, String team) 
	{
		ResultSet result;
		Member member = new Member();
		
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MEMBER_BY_FNAME_LNAME_TEAM);
			preparedStatement.setString(1, "Ambatti");
			preparedStatement.setString(2, "Rayudu");
			preparedStatement.setString(3, "CSK");
			
			System.out.println(preparedStatement);
			result = preparedStatement.executeQuery();
			while(result.next())
		    {
				member = getMemberFromResult(result);
               
		    }
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}
		//System.out.println(player.toString());
		return member;
	}

	@Override
	public Member getMemberByID(int id)
	{
		ResultSet result = null;
		Member member = null;
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MEMBER_BY_ID);
			preparedStatement.setInt(1, 1);
			
			System.out.println(preparedStatement);
		    result = preparedStatement.executeQuery();
		    
		    while(result.next())
		    {
				member = getMemberFromResult(result);
               
		    }
		    
		//	player.setFirstName(result.getString(1));		 
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}
		
		//System.out.println(player.toString());
		return member;
	}

	@Override
	public Member getMemberBySecondName(String s) {
		ResultSet result = null;
		Member member = null;
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MEMBER_BY_LNAME);
			preparedStatement.setString(1, "Rayudu");
			
			System.out.println(preparedStatement);
		    result = preparedStatement.executeQuery();
		    
		    while(result.next())
		    {
				member = getMemberFromResult(result);
               
		    }
		}
		catch (SQLException e)
		{
			printSQLException(e);	
		}
		
		//System.out.println(player.toString());
		return member;
	}



}
