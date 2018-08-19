package application.exception;

import application.domain.MimeTypeGroups;

public class MimeTypeGroupNotFoundException extends RuntimeException {
	
	public MimeTypeGroupNotFoundException(MimeTypeGroups mimeTypeGroup) {
		super("'" + mimeTypeGroup.getMime_type_group_name() + "' : Mime Type Group not found.");
	}

}
