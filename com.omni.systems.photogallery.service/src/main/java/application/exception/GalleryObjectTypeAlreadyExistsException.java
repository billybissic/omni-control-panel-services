package application.exception;

import application.domain.GalleryObjectType;

public class GalleryObjectTypeAlreadyExistsException extends RuntimeException {

	public GalleryObjectTypeAlreadyExistsException(GalleryObjectType galleryObjectType) {
		super("That gallery object type already exists.");
	}
}
