package application.exception;

import application.domain.GalleryStyleType;

public class GalleryStyleTypeAlreadyExistsException extends RuntimeException {

	public GalleryStyleTypeAlreadyExistsException(GalleryStyleType galleryStyleType) {
		super("Gallery Style Type '" + galleryStyleType + "' already exists.");
	}
}
