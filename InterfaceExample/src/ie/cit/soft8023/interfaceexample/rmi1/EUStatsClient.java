package ie.cit.soft8023.interfaceexample.rmi1;

import java.rmi.*;

public class EUStatsClient {

	public static void main(String args[]) {

		EUStats serverObject;
		Remote RemoteObject;

		/* Check number of arguments */
		/* If not enough, print usage string and exit */
		if (args.length < 2) {
			System.out.println("usage: java EUStatsClient IP countryname");
			return;
		}
		/* Set up a security manager as before */
		System.setSecurityManager(new RMISecurityManager());

		try {
			/* See if the object is there... */
			String name = "rmi://" + args[0] + "/EUSTATS-SERVER";
			RemoteObject = Naming.lookup(name);

			serverObject = (EUStats) RemoteObject;
			System.out.println("Main language(s) of " + args[1] + " is/are " + serverObject.getMainLanguages(args[1]));
			System.out.println("Population of " + args[1] + " is " + serverObject.getPopulation(args[1]));
			System.out.println("Capital of " + args[1] + " is " + serverObject.getCapitalName(args[1]));
		} catch (Exception e) {
			System.out.println("Error in invoking object method " + e.toString() + e.getMessage());
			e.printStackTrace();
		}
	}
}
