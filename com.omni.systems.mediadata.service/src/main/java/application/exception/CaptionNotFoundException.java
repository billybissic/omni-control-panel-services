package application.exception;

import application.domain.Captions;

public class CaptionNotFoundException extends RuntimeException {

	public CaptionNotFoundException(Captions caption) {
		super("Caption not found.");
	}
}
