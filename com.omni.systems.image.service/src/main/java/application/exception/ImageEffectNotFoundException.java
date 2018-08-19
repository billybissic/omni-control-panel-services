package application.exception;

import application.domain.ImageEffects;

public class ImageEffectNotFoundException extends RuntimeException {

	public ImageEffectNotFoundException(ImageEffects imageEffect) {
		super("Image Effect: '" + imageEffect.getImage_effect_name() + "' not found.");
	}
}
