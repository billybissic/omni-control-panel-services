package application.exception;

public class NoDataAvailableException extends RuntimeException {

	public NoDataAvailableException() {
		super("Currently no data available.");
	}
}
