package in.co.ipl.model;

import in.co.ipl.utils.Frenchaices;

public class Player extends Person 
{
	public enum role{Batsman,Bowler,AllRounder};
	
	private role primaryRole;
	private boolean isCaptain;
	private boolean isWicketKeeper;
	private Frenchaices franchaices;
	
	public Frenchaices getFranchaices() {
		return franchaices;
	}
	public void setFranchaices(Frenchaices franchaices) {
		this.franchaices = franchaices;
	}
	public role getPrimaryRole()
	{
		return primaryRole;
	}
	@Override
	public boolean equals(Object obj)
	{
		// TODO Auto-generated method stub
		Player p = (Player) obj;
		return this.getFirstName().equalsIgnoreCase(p.getFirstName());
		//return super.equals(obj);
	}
	public void setPrimaryRole(role primaryRole)
	{
		this.primaryRole = primaryRole;
	}
	public boolean isCaptain()
	{
		return isCaptain;
	}
	public void setCaptain(boolean isCaptain) 
	{
		this.isCaptain = isCaptain;
	}
	
	public boolean isWicketKeeper()
	{
		return isWicketKeeper;
	}
	public void setWicketKeeper(boolean isWicketKeeper) 
	{
		this.isWicketKeeper = isWicketKeeper;
	}
	public Player(String Fname,String Lname,  int age, Person.Gender gender , String place, role primaryRole, boolean isCaptain, boolean isWicketKeeper , Frenchaices franchaices)
	{
		super(Fname, Lname, age, place, gender);
		
		this.primaryRole = primaryRole;
		this.isCaptain = isCaptain;
		this.isWicketKeeper = isWicketKeeper;
		this.franchaices = franchaices;
	}
	
	public Player()
	{
		super();
		
	}
	
	
	
	@Override
	public String toString()
	{
		String PlayerData = super.toString();
		PlayerData = PlayerData.concat(" PrimryRole: " + getPrimaryRole());
				
				
		if(isCaptain())
		{
			PlayerData = PlayerData.concat(" and Captain");
		}
		if(isWicketKeeper())
		{
			PlayerData = PlayerData.concat(" and WicketKeeper");
		}
		
		return PlayerData ;
	}
	
	public String getHighestRUns() 
	{
		// TODO Auto-generated method stub
		return "HighestRuns";
	}
	
	public String getBestBowling()
	{
		// TODO Auto-generated method stub
		return "BestBowling";
	}
	
	public String getTotalRuns() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getTotalWickets()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getTotalCatcher()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}
