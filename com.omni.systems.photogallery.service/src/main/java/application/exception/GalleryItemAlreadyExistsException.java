package application.exception;

import application.domain.GalleryItem;

public class GalleryItemAlreadyExistsException extends RuntimeException {
	public GalleryItemAlreadyExistsException(GalleryItem galleryItem) {
		super("Gallery Item already exists.");
		
	}
}
