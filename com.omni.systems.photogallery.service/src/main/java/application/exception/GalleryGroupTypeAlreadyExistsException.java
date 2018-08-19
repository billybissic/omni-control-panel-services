package application.exception;

import application.domain.GalleryGroupType;

public class GalleryGroupTypeAlreadyExistsException extends RuntimeException {

	public GalleryGroupTypeAlreadyExistsException(GalleryGroupType galleryGroupType) {
		super("Gallery Group Type already exists.");
	}
}
