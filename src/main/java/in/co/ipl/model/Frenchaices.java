package in.co.ipl.model;

public enum Frenchaices 
{
	RCB("*ROYAL CHALLENGERS BANGALORE*","RCB", "Bangalore") ,
	CSK("*CHENNAI SUPER KINGS*","CSK","Chennai");
	
	public String Name;
	String Shortname;
	String city;
	
	private Frenchaices(String name, String shortname, String city)
	{
		Name = name;
		Shortname = shortname;
		city = city;
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
}
