package application.exception;

import application.domain.MediaTypes;

public class MediaTypeAlreadyExistsException extends RuntimeException {

	public MediaTypeAlreadyExistsException(MediaTypes mediaType) {
		super("Media Type already exists for Media Type: '" + mediaType.getMedia_type_abbreviation() + "'");
	}
}
