package application.exception;

import application.domain.CaptionTypes;

public class CaptionTypeNotFoundException extends RuntimeException {

	public CaptionTypeNotFoundException(CaptionTypes caption) {
		super("Caption Type: '" + caption.getCaption_type_id() + "' not found");
	}
}
