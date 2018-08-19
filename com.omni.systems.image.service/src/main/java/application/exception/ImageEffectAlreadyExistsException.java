package application.exception;

import application.domain.ImageEffects;

public class ImageEffectAlreadyExistsException extends RuntimeException {
	
	public ImageEffectAlreadyExistsException(ImageEffects imageEffect) {
		super("Image Effect already exists for Effect: '" + imageEffect.getImage_effect_name() + "," + imageEffect.getImage_effect_description() + "'");
	}

}
