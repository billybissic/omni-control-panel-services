package application.exception;

import application.domain.GalleryOrderCategory;

public class GalleryOrderCategoryAlreadyExistsException extends RuntimeException {
	public GalleryOrderCategoryAlreadyExistsException(GalleryOrderCategory galleryOrderCategory) {
		super("Gallery Order Category already exists for category: '" + galleryOrderCategory.getGallery_order_category_name() + "'.");
	}

}
