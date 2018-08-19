package application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.hateoas.VndErrors;

import application.exception.FilesNotFoundException;
import application.exception.NoDataAvailableException;
import application.exception.UploadStashAlreadyExistsException;
import application.exception.UploadStashNotFoundException;

@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class FileControllerAdvice {
	@ResponseBody
	@ExceptionHandler(UploadStashAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors uploadStashAlreadyExistsExceptionHandler(UploadStashAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(FilesNotFoundException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors filesNotFoundException(FilesNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(NoDataAvailableException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors noDataAvailableException(NoDataAvailableException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(UploadStashNotFoundException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors uploadStashNotFoundException(UploadStashNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
}
