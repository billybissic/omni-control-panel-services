package application.exception;

import application.domain.ImageStyles;

public class ImageStyleAlreadyExistsException extends RuntimeException {

		public ImageStyleAlreadyExistsException(ImageStyles imageStyle) {
			super("Image Style already exists for Style: '" + imageStyle.getImage_style_name() + "'");
		}
}
