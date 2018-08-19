package application.exception;

import application.domain.Gallery;

public class GalleryNotFoundException extends RuntimeException {

	public GalleryNotFoundException(Gallery gallery) {
		super("Gallery not found.");
	}
}
