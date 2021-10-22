package in.co.ipl.utils;

import in.co.ipl.exceptions.GenderStringIsNull;
import in.co.ipl.model.Member;
import in.co.ipl.model.Person;
import in.co.ipl.model.Player;

/**
 * @author bhramaramba_ds
 * Utility class
 */

public class Utils
{
	/**
	 * @param gender value as string
	 * @return enum value of gender
	 */
 public Person.Gender findGenderByString(String s)
 {
	 if(s == null || s.isEmpty()) throw new GenderStringIsNull("Gender parameter is null or empty");
	
		 
	           if(Person.Gender.MALE.toString().equalsIgnoreCase(s))
 	           {	
 	                return Person.Gender.MALE;
 	           }
 	           else 
 	           {
 		            return Person.Gender.FEMALE;
 	           }
	
	 
}
 public Player.role findPlayerRoleByString(String s)
 {
	 switch (s)
 	{
		case "BATSMAN": return Player.role.Batsman;
		case "BOWLER": return Player.role.Bowler;
		case "ALLROUNDER": return Player.role.AllRounder;
		
		default: return null;
			
	}
 }
 public Member.role findMemberRoleByString(String s)
 {
	 switch (s)
 	{
		case "Physio": return Member.role.Physio;
	    case "Coach": return Member.role.Coach;

		default: return null;
			
	}
 }
}
