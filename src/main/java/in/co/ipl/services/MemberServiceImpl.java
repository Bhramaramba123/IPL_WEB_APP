package in.co.ipl.services;

import java.util.ArrayList;
import java.util.List;

import in.co.ipl.dao.MemberDAOImp;
import in.co.ipl.model.Member;
import in.co.ipl.utils.Frenchaices;

public class MemberServiceImpl implements MemberService 
{
	
	public List<Member> memberList = new ArrayList<Member>();
    MemberDAOImp memberDAO = new MemberDAOImp();

	public List<Member> getMemberList() 
	{
		return memberList;
	}

	public void setmemberList(List<Member> memberList) 
	{
		this.memberList = memberList;
	}

	public MemberServiceImpl(List<Member> memberList) 
	{
		super();
		this.memberList = memberList;
	}

	public MemberServiceImpl()
	{
		super();
	}

	@Override
	public String toString() 
	{
		String MemberDetails="";
		for(Member member: memberList)
		{
		MemberDetails = MemberDetails.concat(member.toString());
		MemberDetails = MemberDetails.concat(System.lineSeparator());
		}
		return MemberDetails;
	}

	public List<Member> getMembersByTeam(Frenchaices f)
	{
		// TODO Auto-generated method stub
		List<Member> subMembersList = new ArrayList<Member>();
		//PlayerServiceImpl subPlayers = new PlayerServiceImpl();
		for (Member m: getMemberList()) 
		{	
		     if(m.getFrenchaices() == f)
		     {
			subMembersList.add(m);
		     }
		}
		//subPlayers.setPlayerList(subPlayersList);
		return subMembersList;
	}
	
	public void addMember(Member member)
	{
		// TODO Auto-generated method stub
		//playerList.add(player);	
		memberDAO.addMember(member);
	}
    public void removeMember(Member member) 
	{
		memberDAO.deleteMember(member);
		//playerList.remove(player);
		System.out.println(toString());
	}
	@Override
	public void updateMember(Member member) 
	{
		memberDAO.updateMember(member);	
	}
	
	@Override
	public Member getMemberBySecondName(String s)
	{
//		for(Player p1 : getPlayerList())
//		{	
//		 if(p1.getSecondName().trim().equals(s.trim()))
//	      {
//				 return p1;
//	      }
//	         
//		}
		Member member = getMemberBySecondName(s);
		return member;
	}
	@Override
	public List<Member> getCoachByTeam(String team)
	{
		// TODO Auto-generated method stub
		//String teamName = "RCB";
		List<Member> member = getCoachByTeam("CSK");
		return member;
	}
	@Override
	public List<Member> getPhysioByTeam(String team) 
	{
		// TODO Auto-generated method stub
        List<Member> member = getPhysioByTeam("CSK");	
		return member;	
	}

	

	@Override
	public Member getMember(String fname, String lname, String team)
	{
		return null;
	}

	@Override
	public Member getMemberByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getMembersByTeam(String teamName) {
		return memberDAO.getMembersByTeam(teamName);

	}

	@Override
	public void deleteMember(Member member) {
		// TODO Auto-generated method stub
		
	}




	

	

}
