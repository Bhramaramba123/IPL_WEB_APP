package in.co.ipl.model.inteface;

import in.co.ipl.exceptions.RunRateException;
import in.co.ipl.exceptions.ZeroSixException;

public interface ITeams {
	String getTotalMatchs();
	String getTotalWins();
	int getTotalSix() throws ZeroSixException;
	double getNetRunRate() throws RunRateException;

}
