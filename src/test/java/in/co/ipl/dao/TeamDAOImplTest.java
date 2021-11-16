package in.co.ipl.dao;
import static org.junit.Assert.*;
import org.junit.Test;
import in.co.ipl.model.Team;
import in.co.ipl.services.TeamServiceImpl;
import in.co.ipl.tag.DisplayTeamTag;

public class TeamDAOImplTest
{
    @Test
	public void TestgetTeamDetails() 
	{
		int ExpectedTotaSix = 266;
		TeamDAOImpl team = new TeamDAOImpl();
		Team t = team.getTeamDetails("RCB");
		int ActualTotalSix = t.getTotalSix();
		  System.out.println(ActualTotalSix);

		  assertEquals(ExpectedTotaSix,ActualTotalSix);

	}
    
    @Test
    public void testA()
    {
		  int ExpectedTotaSix = 266;
		  TeamServiceImpl teamservice = new TeamServiceImpl(); 
		  Team team = teamservice.getTeamDetailsByName("RCB"); 
		  int ActualTotalSix =team.getTotalSix();
		  System.out.println(ActualTotalSix);
		  assertEquals(ExpectedTotaSix,ActualTotalSix);

    }
    @Test
    public void testGetteamName()
    {
		  String ExpectedTeamName = "RCB";
		  TeamServiceImpl teamservice = new TeamServiceImpl(); 
		  Team team = teamservice.getTeamDetailsByName("RCB"); 
		  String ActualTeamName =team.getTeamName().Shortname;
		  System.out.println(ActualTeamName);
		  assertEquals(ExpectedTeamName,ActualTeamName);

    }
}
