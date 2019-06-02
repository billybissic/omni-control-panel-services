package application.exception;

public class PositionStatusAlreadyExistsException extends RuntimeException {

	public PositionStatusAlreadyExistsException() {
		super("Position status already exists.");
	}
}
