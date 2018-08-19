package application.exception;

import application.domain.OldImages;

public class OldImageNotFoundException extends RuntimeException {

	public OldImageNotFoundException(OldImages oldImage) {
		super("Unable to find Old Image: '" + oldImage.getOld_image_id() + "'");
	}
}
