package application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.hateoas.VndErrors;

import application.exception.GalleryAlreadyExistsException;
import application.exception.GalleryChildAlreadyExistsException;
import application.exception.GalleryChildNotFoundException;
import application.exception.GalleryGroupTypeAlreadyExistsException;
import application.exception.GalleryGroupTypeNotFoundException;
import application.exception.GalleryStyleTypeAlreadyExistsException;
import application.exception.GalleryStyleTypeNotFoundException;
import application.exception.GalleryItemAlreadyExistsException;
import application.exception.GalleryItemNotFoundException;
import application.exception.GalleryNotFoundException;
import application.exception.GalleryObjectTypeAlreadyExistsException;
import application.exception.GalleryObjectTypeNotFoundException;
import application.exception.GalleryOrderCategoryAlreadyExistsException;
import application.exception.GalleryOrderCategoryNotFoundException;
import application.exception.GalleryOrderDirectionNotFoundException;
import application.exception.GalleryOrderTypeNotFoundException;
import application.exception.NoDataAvailableException;

@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class PhotoGalleryControllerAdvice {

	@ResponseBody
	@ExceptionHandler(GalleryAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors galleryAlreadyExistsException(GalleryAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryChildAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors galleryChildAlreadyExistsException(GalleryChildAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryStyleTypeAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors galleryGroupTypeAlreadyExistsException(GalleryStyleTypeAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	@ResponseBody
	@ExceptionHandler(GalleryItemAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors galleryItemAlreadyExistsException(GalleryItemAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryObjectTypeAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors galleryObjectTypeAlreadyExistsException(GalleryObjectTypeAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryGroupTypeAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors galleryGroupTypeAlreadyExistsException(GalleryGroupTypeAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryOrderCategoryAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors galleryOrderCategoryAlreadyExistsException(GalleryOrderCategoryAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(NoDataAvailableException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors noDataAvailableException(NoDataAvailableException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors galleryNotFoundException(GalleryNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryChildNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors galleryChildNotFoundException(GalleryChildNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryStyleTypeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors galleryGroupTypeNotFoundException(GalleryStyleTypeNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryItemNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors galleryItemNotFoundException(GalleryItemNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryObjectTypeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors galleryObjectTypeNotFoundException(GalleryObjectTypeNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryGroupTypeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors galleryGroupTypeNotFoundException(GalleryGroupTypeNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryOrderCategoryNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors galleryOrderCategoryNotFoundException(GalleryOrderCategoryNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryOrderTypeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors galleryOrderCategoryNotFoundException(GalleryOrderTypeNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(GalleryOrderDirectionNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors galleryOrderDirectionNotFoundException(GalleryOrderDirectionNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
}
