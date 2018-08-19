package application.exception;

import application.domain.ImageLinks;

public class ImageLinkAlreadyExistsException extends RuntimeException {

	public ImageLinkAlreadyExistsException(ImageLinks imageLink) {
		super("Image already has an existing link.");
	}
}
