package application.exception;

import application.domain.UploadStash;

public class UploadStashNotFoundException extends RuntimeException {

	public UploadStashNotFoundException(UploadStash uploadStash) {
		super("No upload stash found.");
	}
}
