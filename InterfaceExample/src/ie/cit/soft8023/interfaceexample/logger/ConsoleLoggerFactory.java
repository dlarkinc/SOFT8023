package ie.cit.soft8023.interfaceexample.logger;

public class ConsoleLoggerFactory extends LoggerFactory // Factory
{
	public Logger getLogger() {
		return new ConsoleLogger();
	}
}
