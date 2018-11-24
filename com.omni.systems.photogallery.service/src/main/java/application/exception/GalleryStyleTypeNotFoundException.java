package application.exception;

import application.domain.GalleryStyleType;

public class GalleryStyleTypeNotFoundException extends RuntimeException {

	public GalleryStyleTypeNotFoundException(GalleryStyleType galleryGroupType) {
		super("Gallery style type not found.");
		
	}

	/**
	 * 
	 */
	public GalleryStyleTypeNotFoundException() {
		super("Gallery style type not found.");
	}
}
