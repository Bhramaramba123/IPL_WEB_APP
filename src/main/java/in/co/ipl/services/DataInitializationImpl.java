package in.co.ipl.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import in.co.ipl.model.Member;
import in.co.ipl.model.Player;
import in.co.ipl.model.Team;
import in.co.ipl.setup.DataInitialization;
import in.co.ipl.utils.Frenchaices;
import in.co.ipl.utils.Utils;



public class DataInitializationImpl implements DataInitialization
{
     Player player = new Player();
     PlayerServiceImpl playerService = new PlayerServiceImpl();
     
     Member member = new Member();
     MemberServiceImpl memberService = new MemberServiceImpl();
     
     Team team = new Team();
     TeamServiceImpl teamService = new TeamServiceImpl();
     
	 List<Player> PlayerList = new ArrayList<Player>();
	 List<Member> MemberList = new ArrayList<Member>();
	 List<Team> TeamList = new ArrayList<Team>();
	 
	 Utils utils = new Utils();


	@Override
	public PlayerServiceImpl InitPlayers() 
	{
		// TODO Auto-generated method stub
		//List<Player> PlayerList = new ArrayList<Player>();

		//PlayerList.add(new Player("Virat", "Koli", 30,Person.Gender.MALE,"Delhi",Player.role.Batsman,true,false));
		//PlayerList.add(new Player("Ab", "de villers", 30,Person.Gender.MALE,"Bela-Bela",Player.role.Batsman,false,true));
		//PlayerList.add(new Player("DevDUtt", " Padikal", 25,Person.Gender.MALE,"Bangalore",Player.role.Batsman,false,false));
		//PlayerList.add(new Player("Yuzvendra", "Chahal", 32,Person.Gender.MALE,"Jind",Player.role.Bowler,false,false));
		
		//Players  p1 = new Players(PlayerList);
		
		
			 playerService = readPlayerDataFromFile();
			 
			 return playerService;
		
	}

	public TeamServiceImpl readTeamDataFromFile() 
	{
		File file = new File("Resource/Team.txt");
	    Scanner sc = null;
				
	    try {			
	    	sc = new Scanner(file);		
	    } 
	    catch (FileNotFoundException e)
	    {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
	    }  
			    while (sc.hasNextLine())
			    {
					String TeamRecord = sc.nextLine();
					Team team = addTeamToList(TeamRecord);
					teamService.addTeam(team);
					//TeamList.add(addTeamToList(TeamRecord));
			      //System.out.println(sc.nextLine());
			    	
			    	
			    }
			    //PlayerList.add(player);
			    //teams.setTeamList(TeamList);
		return teamService;
	}
	
	
	public Team addTeamToList(String teamRecord) {
		// TODO Auto-generated method stub
		//Members members = new Members();
		String[] IRecord = teamRecord.split(",");
		
   
   	 team.setTotalSix(Integer.parseInt(IRecord[0].trim()));
   	 team.setNetRunRate(Double.parseDouble(IRecord[1].trim()));
   	 team.setKnockOut(Boolean.parseBoolean(IRecord[2].trim()));
	 team.setTeamName(Frenchaices.getFranchaicesByString(IRecord[3].trim()));
	 
   	 //team.setPlayers(playerService.getPlayersByTeam(team.getTeamName()));
   	 //team.setMembers(memberService.getMembersByTeam(team.getTeamName()));
   	 
	
		return team;
	}

	public PlayerServiceImpl readPlayerDataFromFile() 
	{
		File file = new File("Resource/Players.txt");
			    Scanner sc = null;
				try {
					sc = new Scanner(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			  
			    while (sc.hasNextLine())
			    {
					String PlayerRecord = sc.nextLine();
					Player player = addPlayerToList(PlayerRecord);
					playerService.addPlayer(player);
					//PlayerList.add(addPlayerToList(PlayerRecord));
			      //System.out.println(sc.nextLine()); 		
			    }
			    //PlayerList.add(player);
			    //players.setPlayerList(PlayerList);		
		return playerService; 
	}
	
	public Player addPlayerToList(String PlayerRecord)
	{
		 Player player = new Player();
		 String[] IRecord = PlayerRecord.split(",");
		 
    	 player.setFirstName(IRecord[0].trim());
    	 player.setSecondName(IRecord[1].trim());
    	 player.setAge(Integer.parseInt(IRecord[2].trim()));
    	 player.setGender(utils.findGenderByString(IRecord[3].trim()));
    	 player.setPlace(IRecord[4].trim());
    	 player.setPrimaryRole(utils.findPlayerRoleByString(IRecord[5].trim()));
    	 player.setCaptain(Boolean.parseBoolean(IRecord[6].trim()));
    	 player.setWicketKeeper(Boolean.parseBoolean(IRecord[7].trim()));
    	 player.setFranchaices(Frenchaices.getFranchaicesByString(IRecord[8].trim()));
    	
	     System.out.println(player.toString());
		return player;
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public MemberServiceImpl readMemberDataFromFile() 
	{
		File file = new File("Resource/Staff.txt");
			    Scanner sc = null;
				try {
					sc = new Scanner(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    while (sc.hasNextLine())
			    {
			      //System.out.println(sc.nextLine());
			    
			    	String MemberRecord = sc.nextLine();
			    	Member member = addMemberToList(MemberRecord);
			    	memberService.addMember(member);
			    	//MemberList.add(member);
			    	//member.addMember(member);
			    	
			    }
			    //members.setMembers(MemberList);
			    return memberService;
	}
	
	public Member addMemberToList(String memberRecord) 
	{
		// TODO Auto-generated method stub
	    String[] StaffRecord = memberRecord.split(",");
	    
    	member.setFirstName(StaffRecord[0].trim());
    	member.setSecondName(StaffRecord[1].trim());
    	member.setAge(Integer.parseInt(StaffRecord[2].trim()));
    	member.setGender(utils.findGenderByString(StaffRecord[3].trim()));
    	member.setPlace(StaffRecord[4].trim());
    	member.setRole(utils.findMemberRoleByString(StaffRecord[5].trim()));
    	member.setFrenchaices(Frenchaices.getFranchaicesByString(StaffRecord[6].trim()));
    	
    	System.out.println(member.toString());
		return member;
	}
	
	@Override
	public MemberServiceImpl InitMembers() 
	{
		// TODO Auto-generated method stub
		//List<Member> MemberList = new ArrayList<Member>();
		//StaffList.add(new Member("Mike", "Hesson", 50, Person.Gender.MALE, "NZ",Member.role.Coach));
		//StaffList.add(new Member("Navnita", "Gautam", 30, Person.Gender.FEMALE, "Punjab", Member.role.Physio));
		
		//Members s1 = new Members(MemberList);
		//return s1;
		memberService = readMemberDataFromFile();
		return memberService;
	}

	@Override
	public Member InitMember() 
	{
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Team InitTeam() 
//	{
//		// TODO Auto-generated method stub
//		
//		//Team teamRCB = new Team(Frenchaices.RCB.Name , 0, 0.537, false, InitPlayers(),InitMembers());
//		//Teams teamCSK = new Teams(Frenchaices.CSK.Name, 251, 0.181, false, csk.getPlayerList(),cskStaff.getStaff());
//		return teamRCB;
//	}

	@Override
	public TeamServiceImpl InitTeams() {
		// TODO Auto-generated method stub
		InitPlayers();
		InitMembers();
		return readTeamDataFromFile();
		
	}

	public void deletePlayerFromList(String secondName)
	{
		Player deletePlayer = new Player();
		
		int index = 0;
		System.out.println("" +playerService.getPlayerList().size());
		
		for(Player p : playerService.getPlayerList())
		{
			
		 if(p.getSecondName().trim().equals(secondName.trim()))
	          {
				  index = playerService.getPlayerList().indexOf(p);
	              //PlayerList.remove(index);
				  System.out.println("index=" +index);
	              break;
	             
	              //System.out.println(PlayerList);
	          }
	          else
	          {
	    	 System.out.println("Player Not Found");
	          }
		}
		System.out.println("Removing Player");
		playerService.getPlayerList().remove(index);
		 System.out.println(playerService.toString());
	}

	@Override
	public Player InitPlayer()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void updatePlayerInList(String secondName) 
	{
		// TODO Auto-generated method stub
		//Player updatePlayer = new Player();
		for(Player p : playerService.getPlayerList())
		{
			//p.setSecondName(secondName);
		 if(p.getSecondName().trim().equals(secondName.trim()))
	     {
			 p.setAge(12);
	     }
		}
		
	}

	@Override
	public Team InitTeam() {
		// TODO Auto-generated method stub
		return null;
	}

}
