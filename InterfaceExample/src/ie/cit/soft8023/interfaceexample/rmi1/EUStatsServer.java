package ie.cit.soft8023.interfaceexample.rmi1;

import java.rmi.*; // Classes and support for RMI
import java.rmi.server.*; // Classes and support for RMI servers
import java.util.Hashtable; // Contains Hashtable class
//import EUstats.*;			// Assumed to contain EUData class

public class EUStatsServer extends UnicastRemoteObject implements EUStats {

	/* Store data in a hashtable */
	Hashtable<String, EUData> EUDbase = new Hashtable<String, EUData>();

	/* Constructor - set up database */
	EUStatsServer() throws RemoteException {
		EUDbase.put("France", new EUData("French", 57800000, "Paris"));
		EUDbase.put("United Kingdom", new EUData("English", 57998000, "London"));
		EUDbase.put("Greece", new EUData("Greek", 10270000, "Athens"));
		EUDbase.put("Germany", new EUData("German", 81051000, "Berlin"));
		EUDbase.put("Sweden", new EUData("Swedish", 8721000, "Stockholm"));
		EUDbase.put("Denmark", new EUData("Danish", 5181000, "Copenhagen"));
		EUDbase.put("Finland", new EUData("Finnish", 5076000, "Helsinki"));
		EUDbase.put("Luxembourg", new EUData("Letzburgish/French/German", 395200, "Luxembourg"));
		EUDbase.put("Netherlands", new EUData("Dutch", 15269000, "Amsterdam/The Hague"));
		EUDbase.put("Belgium", new EUData("French/Flemish/German", 10020000, "Brussels"));
		EUDbase.put("Austria", new EUData("German", 7910000, "Vienna"));
		EUDbase.put("Italy", new EUData("Italian", 56767000, "Rome"));
		EUDbase.put("Ireland", new EUData("Irish/English", 3548000, "Dublin"));
		EUDbase.put("Spain", new EUData("Spanish", 39166000, "Madrid"));
		EUDbase.put("Portugal", new EUData("Portuguese", 9846000, "Lisbon"));
	}

	/* Now implement the interface methods */
	public String getMainLanguages(String CountryName) throws RemoteException {

		EUData Data = (EUData) EUDbase.get(CountryName);
		return Data.getLangs();
	}

	public int getPopulation(String CountryName) throws RemoteException {

		EUData Data = (EUData) EUDbase.get(CountryName);
		return Data.getPop();
	}

	public String getCapitalName(String CountryName) throws RemoteException {

		EUData Data = (EUData) EUDbase.get(CountryName);
		return Data.getCapital();
	}

	/* Now define main method */

	public static void main(String args[]) {

		try {

			/* Create an instance of the EUStatsServer object */
			EUStatsServer statsServer = new EUStatsServer();

			/* Put it in the Registry */
			Naming.rebind("EUSTATS-SERVER", statsServer);

		}
		/* If the URL-formatted name is not legal... */
		catch (java.net.MalformedURLException e) {
			System.out.println("Malformed URL for EUStatServer name " + e.toString());
		}

		/* If any communication failures occur... */
		catch (RemoteException e) {
			System.out.println("Communication error " + e.toString());
		}
	}
}

class EUData {

	private String Language;
	private int population;
	private String Capital;

	EUData(String Lang, int pop, String Cap) {

		Language = Lang;
		population = pop;
		Capital = Cap;
	}

	String getLangs() {
		return Language;
	}

	int getPop() {
		return population;
	}

	String getCapital() {
		return Capital;
	}
}
