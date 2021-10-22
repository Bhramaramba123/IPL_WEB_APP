package in.co.ipl.dao;
import java.util.List;

import in.co.ipl.model.Member;

public interface MemberDAO 
{
	public void addMember(Member member);
	void deleteMember(Member member);
	void updateMember(Member member);
	
	Member getMember(String fname, String lname, String team);
	
	Member getMemberByID(int id);
	List<Member> getMembersByTeam(String team);
	List<Member> getCoachByTeam(String team);
	List<Member> getPhysioByTeam(String team);
	Member getMemberBySecondName(String s);

}
