package application.exception;

import application.domain.MimeTypeGroups;

public class MimeTypeGroupAlreadyExistsException extends RuntimeException {
	
	public MimeTypeGroupAlreadyExistsException(MimeTypeGroups mimeTypeGroup) {
		super("'" + mimeTypeGroup.getMime_type_group_name() + "' : Group already exists for this Mime Type.");
	}
}
