package application.exception;

import application.domain.GalleryItem;

public class GalleryItemNotFoundException extends RuntimeException {

	public GalleryItemNotFoundException(GalleryItem galleryItem) {
		super("Gallery Item Not Found");
	}
}
