package in.java.ipl.job;

import java.io.FileNotFoundException;

import in.co.ipl.services.DataInitializationImpl;



public class ReadStaffThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DataInitializationImpl DI = new DataInitializationImpl() ;
		DI.readMemberDataFromFile();
		
	}

}
