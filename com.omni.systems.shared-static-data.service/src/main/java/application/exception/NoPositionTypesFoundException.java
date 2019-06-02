package application.exception;

public class NoPositionTypesFoundException extends RuntimeException {

	public NoPositionTypesFoundException() {
		super("No position types found.");
	}
}
