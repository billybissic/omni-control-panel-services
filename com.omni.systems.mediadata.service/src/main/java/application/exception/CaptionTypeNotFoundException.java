package application.exception;

import application.domain.CaptionTypes;

public class CaptionTypeNotFoundException extends RuntimeException {

	public CaptionTypeNotFoundException(String captionName) {
		super("Caption Type: '" + captionName + "' not found");
	}
}
