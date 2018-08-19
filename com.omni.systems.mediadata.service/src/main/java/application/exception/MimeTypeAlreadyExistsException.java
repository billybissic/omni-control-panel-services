package application.exception;

import application.domain.MimeTypes;

public class MimeTypeAlreadyExistsException extends RuntimeException {
	
	public MimeTypeAlreadyExistsException(MimeTypes mimeType) {
		super("The mime type '" + mimeType.getMime_type_name() + "' already exists. Cannot continue with this procedure.");
	}

}
