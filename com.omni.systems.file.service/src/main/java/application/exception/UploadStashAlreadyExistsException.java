package application.exception;

import application.domain.UploadStash;

public class UploadStashAlreadyExistsException extends RuntimeException {
	public UploadStashAlreadyExistsException(UploadStash uploadStash)
	{
		super("An upload stash already exists for this user");
	}
}
