package application.exception;

import application.domain.ImageMetaData;

public class ImageMetaDataNotFoundException extends RuntimeException {

	public ImageMetaDataNotFoundException(ImageMetaData imageMetaData) {
		super("No image meta for this image.");
	}
}
