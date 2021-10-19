package in.co.ipl.model;

import java.util.ArrayList;
import java.util.List;



public class Member extends Person
{
	public enum role{Physio,Coach};
	public role Role;
	public Frenchaices frenchaices;
	List<Member> memberList = new ArrayList<Member>();
	
	
	
	public List<Member> getMemberList() {
		return memberList;
	}
	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
	public Frenchaices getFrenchaices() {
		return frenchaices;
	}
	public void setFrenchaices(Frenchaices frenchaices) {
		this.frenchaices = frenchaices;
	}
	public role getRole()
	{
		return Role;
	}
	public void setRole(role role)
	{
		Role = role;
	}
	public Member(String Fname, String Lname, int age,Person.Gender gender, String place, role role , Frenchaices frenchaices) 
	{
		super(Fname, Lname, age, place, gender);
		this.Role = role;
		this.frenchaices = frenchaices;
	}
	public Member()
	{
		super();
	}
	public String toString()
	{
		String MemberData = super.toString();
		MemberData = MemberData.concat(" Role: " + getRole());
		MemberData = MemberData.concat(" Frenchaices: " + getFrenchaices());
		return MemberData ;
	}
	
	
	
}
