package ie.cit.soft8023.interfaceexample.logger;

public class ConsoleLogger implements Logger {

	public void error(String msg) {
		System.err.println("ERROR: " + msg);
	}

	public void debug(String msg) {
		System.err.println("DEBUG: " + msg);
	}

}
