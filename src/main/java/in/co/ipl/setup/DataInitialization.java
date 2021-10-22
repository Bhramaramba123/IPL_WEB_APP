/**
 * 
 */
package in.co.ipl.setup;
import java.util.ArrayList;

import in.co.ipl.model.Member;
import in.co.ipl.model.Player;
import in.co.ipl.model.Team;
import in.co.ipl.services.MemberServiceImpl;
import in.co.ipl.services.PlayerServiceImpl;
import in.co.ipl.services.TeamServiceImpl;



/**
 * @author bhramaramba_ds
 *
 */
public interface DataInitialization 
{
 public PlayerServiceImpl InitPlayers();
 public Player InitPlayer();
 public MemberServiceImpl InitMembers();
 public Member InitMember();
 public Team InitTeam();
 public TeamServiceImpl InitTeams();
	
	
	
}
