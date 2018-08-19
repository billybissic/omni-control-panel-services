package application.exception;

import application.domain.MediaTypes;

public class MediaTypeNotFoundException extends RuntimeException {

	public MediaTypeNotFoundException(MediaTypes mediaType) {
		super("Media Type not found.");
	}
}
