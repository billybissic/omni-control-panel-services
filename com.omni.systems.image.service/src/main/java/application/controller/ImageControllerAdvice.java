package application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.hateoas.VndErrors;

import application.exception.ImageEffectAlreadyExistsException;
import application.exception.ImageEffectNotFoundException;
import application.exception.ImageLinkAlreadyExistsException;
import application.exception.ImageLinkNotFoundException;
import application.exception.ImageMetaDataNotFoundException;
import application.exception.ImageStyleAlreadyExistsException;
import application.exception.ImageStyleNotFoundException;
import application.exception.NoDataAvailableException;
import application.exception.OldImageNotFoundException;

@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class ImageControllerAdvice {

	@ResponseBody
	@ExceptionHandler(ImageEffectAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors imageEffectAlreadyExistsExceptionHandler(ImageEffectAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(ImageLinkAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors imageLinkAlreadyExistsException(ImageLinkAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(ImageStyleAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors imageStyleAlreadyExistsException(ImageStyleAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(NoDataAvailableException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors noDataAvailableException(NoDataAvailableException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(ImageEffectNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors imageEffectNotFoundException(ImageEffectNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(ImageLinkNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors imageLinkNotFoundException(ImageLinkNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(ImageMetaDataNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors imageMetaDataNotFoundException(ImageMetaDataNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(ImageStyleNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors imageStyleNotFoundException(ImageStyleNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(OldImageNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors oldImageNotFoundException(OldImageNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
}
