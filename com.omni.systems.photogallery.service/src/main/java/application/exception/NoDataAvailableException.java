package application.exception;

public class NoDataAvailableException extends RuntimeException {
	public NoDataAvailableException()
	{
		super("Unable to perform retrieve. There appears to be no data available.");
	}
}
