package application.exception;

import application.domain.GalleryObjectType;

public class GalleryObjectTypeNotFoundException  extends RuntimeException {
	public GalleryObjectTypeNotFoundException(GalleryObjectType galleryObjectType) {
		super("Gallery object type not found for gallery object type: '" + galleryObjectType.getGallery_object_type_name() + "'");
	}
}
