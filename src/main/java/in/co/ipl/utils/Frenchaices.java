package in.co.ipl.utils;

import java.util.LinkedHashSet;
import java.util.Set;

import in.co.ipl.model.Team;

public enum Frenchaices 
{
	RCB("ROYAL CHALLENGERS BANGALORE","RCB","Bangalore") ,
	CSK("CHENNAI SUPER KINGS","CSK","Chennai"),
	RR("Rajasthan Royals","RR", "Rajasthan") ,
	KKR("Kolkata Knight Riders","KKR","Kolkata"),
	DC("Delhi Capitals","DC", "Delhi") ,
	MI("Mumbai Indians","MI","Mumbai"),
	PK("Punjab Kings","PK", "Punjab") ,
	SH("Sunrisers Hyderabad","SH","Hyderabad");
	
	public String Name;
	public String Shortname;
	public String city;
    static Set<String> data = new LinkedHashSet<String>();   

	private Frenchaices(String name, String shortname, String city)
	{
		this.Name = name;
		this.Shortname = shortname;
		this.city = city;
	}
	
	public static Frenchaices  getFranchaicesByString(String Sname)
	{
		for (Frenchaices f:Frenchaices.values())
		{
			if(f.Shortname.equalsIgnoreCase(Sname))
			{
				return f;
			}
		}
		return null;
	}
	
	public static  Set<String>   getShortnamesByFrenchaices()
	{
		for (Frenchaices f:Frenchaices.values())
		{
			data.add(f.Shortname);	
		}
		return data;
	}
	
	public String getPlace(Team team)
	{
		return team.getTeamName().city;
	}
	
	@Override
	public String toString()
	{
		return this.Shortname;
	}
}
