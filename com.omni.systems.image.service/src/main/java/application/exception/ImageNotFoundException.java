package application.exception;

import application.domain.Images;

public class ImageNotFoundException extends RuntimeException {
	
	public ImageNotFoundException(Images image) {
		super("Unable to find Image: '" + image.getImage_id() + "'");
	}

}
