package in.co.ipl.model;

import java.util.HashMap;
import java.util.List;
import in.co.ipl.exceptions.RunRateException;
import in.co.ipl.exceptions.ZeroSixException;
import in.co.ipl.utils.Frenchaices;


public class Team 
{
	private static final Player[] player = null;
	private Frenchaices teamName ;
	private int totalSix ;
	private double netRunRate ;
	private boolean isKnockOut ;
   // private List<Player> players ;
   // private List<Member> members ;
    private List<Player> players;
    private List<Member> members;
    
    public Team(Frenchaices name, int totalSix, double netRunRate, boolean isKnockOut, List<Player> players, List<Member> members) {
		super();
		this.teamName = name;
		this.totalSix = totalSix;
		this.netRunRate = netRunRate;
		this.isKnockOut = isKnockOut;
		this.players = players;
		this.members = members;
	}
	//private PlayersRCB players; 
	
	public Frenchaices getTeamName()
	{
		return teamName;
	}
	
	public List<Member> getMembers() {
		return members;
	}

	
	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public static Player[] getPlayer() {
		return player;
	}
	public void setTeamName(Frenchaices teamName)
	{
		this.teamName = teamName;
	}
	
    public void setTotalSix(int totalSix) 
    {
		this.totalSix = totalSix;
	}
    
    public void setNetRunRate(double netRunRate)
    {
		this.netRunRate = netRunRate;
	}
    public boolean isKnockOut() 
    {
		return isKnockOut;
	}
    public void setKnockOut(boolean isKnockOut)
    {
		this.isKnockOut = isKnockOut;
	}
 
    
	public Team()
	{
		// TODO Auto-generated constructor stub
	}

	
	public void printTeams() 
	{
		// System.out.println(" >>IPL TEAM - ROYAL CHALLENGERS BANGALORE. \n >>CAPTAIN - Virat Koli. \n >>WICKET KEEPER - AB de villers. \n >>BATSMAN - DevDUtt Padikal \n >>BOWLER - Yuzvendra Chahal \n >>Total of 266 sixes \n >> Net run rate is 0.171 \n >> not been knock out yet");
		 System.out.println("--------------------------------------------------------------------------------------------");
		 System.out.println(teamName);
        System.out.println("PLAYERS:");
        for(Player player: players)
        {
        	//System.out.println(player.getFullName());
        	System.out.println(player.toString());
           
        }
        System.out.println("--------------------------------------------------------------------------------------------");
    	/*<---------------------------------------------------------------------->*/
        for(Member member: ((Member) members).getMemberList())
        {
        	System.out.println(member.toString());
           
        }
    	/*<---------------------------------------------------------------------->*/
		try
		{
			System.out.println("RCS's Total number of Six is :" + getTotalSix());
		}
		
		catch(Exception e)
		{
		System.out.println(e);	
		}
		
		/*<---------------------------------------------------------------------->*/
	    try
	    {
	    	System.out.println("RCS's Net run rate is :" + getNetRunRate()); 	
	    }
	    catch (Exception e) 
	    {
	    	System.out.println(e);	
	    }
		
	    System.out.println(" has RCB Knocked out :" + isKnockOut);
	    
	    
	}

	
	
	  @Override 
	  public String toString()
	  { 
		  String teamData = ""; 
		  teamData = teamData.concat(" Team Name " + getTeamName().Name); 
		  teamData = teamData.concat(System.lineSeparator());
		  for(Player player : getPlayers()) 
		  {
	  teamData = teamData.concat(player.toString()); 
	  teamData =teamData.concat(System.lineSeparator()); 
	  }
	  
	  for(Member member : getMembers())
	  { 
		  teamData =
	  teamData.concat(member.toString()); teamData =
	  teamData.concat(System.lineSeparator());
	  }
	  
	  
	  
	  return teamData; 
	  }
	 
	
	
	public String getTotalMatchs() {
		// TODO Auto-generated method stub
		return "TotalMatchs";
	}
	public String getTotalWins() {
		// TODO Auto-generated method stub
		return "TotalWins";
	}
	
	public int getTotalSix() 
	{		
		return totalSix;	
	}

	public double getNetRunRate() 
	{	
		return netRunRate;
	}

	public void setPlayers(List<Player> players) {
		// TODO Auto-generated method stub
		this.players = players;
		
	}
	
	
	

}
