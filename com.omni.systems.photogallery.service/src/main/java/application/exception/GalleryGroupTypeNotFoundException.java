package application.exception;

import application.domain.GalleryGroupType;

public class GalleryGroupTypeNotFoundException extends RuntimeException {

	public GalleryGroupTypeNotFoundException(GalleryGroupType galleryGroupType) {
		super("Gallery group type already exists.");
		
	}
}
