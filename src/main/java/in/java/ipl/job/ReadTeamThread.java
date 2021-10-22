package in.java.ipl.job;

import in.co.ipl.services.DataInitializationImpl;

public class ReadTeamThread implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		DataInitializationImpl DI = new DataInitializationImpl() ;
		DI.readTeamDataFromFile();
		
	}
}
