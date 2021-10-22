package in.co.ipl.services;

import java.util.List;

import in.co.ipl.model.Member;


public interface MemberService
{

	
	public void addMember(Member member);
	public void deleteMember(Member member);
	public void updateMember(Member member);
	
	Member getMember(String fname, String lname, String team);
	
	Member getMemberByID(int id);
	List<Member> getMembersByTeam(String team);
	List<Member> getCoachByTeam(String team);
	List<Member> getPhysioByTeam(String team);
	public Member getMemberBySecondName(String s);
}
