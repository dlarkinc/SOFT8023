package ie.cit.soft8023.interfaceexample.logger;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileLogger implements Logger { // product B
	private PrintStream out;

	FileLogger(String file) throws IOException // constructor
	{
		this.out = new PrintStream(new FileOutputStream(file), true);
	}

	public void error(String msg) {
		out.println("ERROR: " + msg);
	}

	public void debug(String msg) {
		out.println("DEBUG: " + msg);
	}
}
