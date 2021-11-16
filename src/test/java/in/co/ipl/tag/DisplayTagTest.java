package in.co.ipl.tag;

import static org.junit.Assert.*;
import org.junit.Test;
import in.co.ipl.model.Team;
import in.co.ipl.services.TeamServiceImpl;



public class DisplayTagTest 
{
		@Test
		public void testGetPlace() 
		{
			
			  DisplayTeamTag tag = new DisplayTeamTag(); 
			  String ExpectedPlaceName = "Bangalore";
			  TeamServiceImpl teamservice = new TeamServiceImpl(); 
			  Team team = teamservice.getTeamDetailsByName("RCB"); 
			  String ActualPlaceName =tag.getPlace(team);
			  
			  assertEquals(ExpectedPlaceName,ActualPlaceName);
		}
		@Test
		public void testgetTeam()
		{
			DisplayTeamTag tag = new DisplayTeamTag(); 
			String ExpectedName = "RCB";
			TeamServiceImpl teamservice = new TeamServiceImpl(); 
			Team team = teamservice.getTeamDetailsByName("RCB");
			String ActualName = team.getTeamName().Shortname;
			  assertEquals(ExpectedName,ActualName);

		}
	

}
