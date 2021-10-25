package in.co.ipl.services;

import java.util.List;

import in.co.ipl.model.Member;
import in.co.ipl.utils.Frenchaices;


public interface MemberService
{

	
	public void addMember(Member member);
	public void deleteMember(Member member);
	public void updateMember(Member member);
	
	public Member getMember(String fname, String lname, String team);
	
	public Member getMemberByID(int id);
	public List<Member> getMembersByTeam(Frenchaices f);
	public List<Member> getCoachByTeam(String team);
	public List<Member> getPhysioByTeam(String team);
	public Member getMemberBySecondName(String s);
	public List<Member> getMembersByTeam(String teamName);
}
