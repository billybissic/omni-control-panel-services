package application.exception;

import application.domain.GalleryChildren;

public class GalleryChildNotFoundException extends RuntimeException {

	public GalleryChildNotFoundException(GalleryChildren galleryChild) {
		super("No gallery child Found.");
	}
}
