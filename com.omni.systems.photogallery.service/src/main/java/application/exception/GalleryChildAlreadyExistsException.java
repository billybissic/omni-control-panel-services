package application.exception;

import application.domain.GalleryChildren;

public class GalleryChildAlreadyExistsException extends RuntimeException {
	
	public GalleryChildAlreadyExistsException(GalleryChildren galleryChild) {
		super("Gallery child already exists under that parent");
	}
}
