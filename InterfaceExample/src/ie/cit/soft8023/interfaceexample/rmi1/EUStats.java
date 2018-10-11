package ie.cit.soft8023.interfaceexample.rmi1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EUStats extends Remote {

	String getMainLanguages(String CountryName)
	    throws RemoteException;
	    
	int getPopulation(String CountryName)
	    throws RemoteException;
	    
	String getCapitalName(String CountryName)
	    throws RemoteException;
}
