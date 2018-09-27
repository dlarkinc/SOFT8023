package ie.cit.soft8023.interfaceexample.logger;

import java.io.IOException;

public class FileLoggerFactory extends LoggerFactory {

	public FileLoggerFactory() throws IOException {
		super();
	}

	//private Logger log = new FileLogger(System.getProperty("log.file"));
	private Logger log = new FileLogger("system.log");

	public Logger getLogger() {
		return log;
	}
}
