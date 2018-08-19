package application.exception;

public class FilesNotFoundException extends RuntimeException {
	
	public FilesNotFoundException() {
		super("Files not found for the current user's upload cache.");
	}

}
