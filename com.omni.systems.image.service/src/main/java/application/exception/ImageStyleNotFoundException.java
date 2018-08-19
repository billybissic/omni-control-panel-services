package application.exception;

import application.domain.ImageStyles;

public class ImageStyleNotFoundException extends RuntimeException {
	
	public ImageStyleNotFoundException(ImageStyles imageStyle) {
		super("Unable to find Image Style: '" + imageStyle.getImage_style_name() + "'");
	}
	
}
