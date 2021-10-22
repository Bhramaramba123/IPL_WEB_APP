package in.co.ipl.model;

import java.util.ArrayList;
import java.util.List;

import in.co.ipl.utils.Frenchaices;



	public class Members
	{
		List<Member> memberList = new ArrayList<Member>();
	
		public List<Member> getMemberList() 
		{
		return memberList;
	    }
	
		public void setMembers(List<Member> memberList) 
		{
		this.memberList = memberList;
		}
	
		public Members(List<Member> membersList)
		{
		super();
		this.memberList = memberList;
	    }

		public Members() {
			// TODO Auto-generated constructor stub
		}
		public void addMember(Member member)
		{
			memberList.add(member);
		}

		public Members getMembersByTeam(Frenchaices f) {
			// TODO Auto-generated method stub
			List<Member> subMemberList = new ArrayList<Member>();
			Members subMembers = new Members();
			for (Member m: memberList) 
			{	
			if(m.getFrenchaices() == f)
			{
				subMemberList.add(m);
			}
				
				
			}
			subMembers.setMembers(subMemberList);
			
			return subMembers;
			
		}

     }
