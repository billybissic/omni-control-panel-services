package application.exception;

import application.domain.CaptionTypes;

public class CaptionTypeAlreadyExistsException extends RuntimeException {
	
	public CaptionTypeAlreadyExistsException(CaptionTypes captionType) {
		super("Caption Type: '" + captionType.getCaptionTypeName() + "', already exists.");
	}
}
