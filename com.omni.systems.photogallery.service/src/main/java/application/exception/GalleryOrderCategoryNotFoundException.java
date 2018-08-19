package application.exception;

import application.domain.GalleryOrderCategory;

public class GalleryOrderCategoryNotFoundException extends RuntimeException {

	public GalleryOrderCategoryNotFoundException(GalleryOrderCategory galleryOrderCategory) {
		super("No gallery order category found of the name: '" + galleryOrderCategory.getGallery_order_category_name() + "'");
	}

}
