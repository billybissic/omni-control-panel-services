package application.exception;

import application.domain.Gallery;

public class GalleryAlreadyExistsException extends RuntimeException {

	public GalleryAlreadyExistsException(Gallery gallery) {
		super("Gallery already exists.");
	}
}
