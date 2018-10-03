/**
* MIT License
*
* Copyright (c) 2018 Billy Bissic
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
**/
package application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import application.exception.EventDetailsNotFoundException;
import application.exception.EventFrequencyAlreadyExistsException;
import application.exception.EventFrequencyNotFoundException;
import application.exception.EventNotFoundException;
import application.exception.EventStatusAlreadyExistsException;
import application.exception.EventStatusNotFoundException;
import application.exception.EventTypeAlreadyExistsException;
import application.exception.EventTypeNotFoundException;
import application.exception.NoDataAvailableException;

import org.springframework.hateoas.VndErrors;

/**
 * @author Billy Bissic
 *
 */
@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class EventManagementControllerAdvice {
	
	@ResponseBody
	@ExceptionHandler(EventDetailsNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors eventDetailsNotFoundException(EventDetailsNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EventNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors eventNotFoundException(EventNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EventStatusNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors eventStatusNotFoundException(EventStatusNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EventTypeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors eventTypeNotFoundException(EventTypeNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EventFrequencyNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors eventFrequencyNotFoundException(EventFrequencyNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EventStatusAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors eventStatusNotFoundException(EventStatusAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EventTypeAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors eventTypeNotFoundException(EventTypeAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EventFrequencyAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors eventFrequencyAlreadyExistsException(EventFrequencyAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(NoDataAvailableException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors noDataAvailableException(NoDataAvailableException ex) {
		return new VndErrors("error", ex.getMessage());
	}
}
