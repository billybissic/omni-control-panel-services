package application.exception;

import application.domain.ImageLinks;

public class ImageLinkNotFoundException extends RuntimeException {
	
	public ImageLinkNotFoundException(ImageLinks imageLink) {
		super("Image link not found for image.");
	}
}
