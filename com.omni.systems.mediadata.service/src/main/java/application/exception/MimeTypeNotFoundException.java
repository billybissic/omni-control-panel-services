package application.exception;

import application.domain.MimeTypes;

public class MimeTypeNotFoundException extends RuntimeException {
	public MimeTypeNotFoundException(MimeTypes mimeType) {
		super("Unable to find any mime type with the name '" + mimeType.getMime_type_name() + "'");
	}
}
