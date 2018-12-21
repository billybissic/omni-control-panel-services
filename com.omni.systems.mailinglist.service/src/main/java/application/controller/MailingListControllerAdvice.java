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

import org.springframework.hateoas.VndErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import application.exception.DuplicateSubscriberException;
import application.exception.DuplicateSubscriberGroupException;
import application.exception.NoDataAvailableException;
import application.exception.NoUnassignedSubscribersFoundException;
import application.exception.SubscriberNotFoundException;

/**
 * @author Billy Bissic
 *
 */

@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class MailingListControllerAdvice {
	
	@ResponseBody
	@ExceptionHandler(DuplicateSubscriberException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors duplicateSubscriberException(DuplicateSubscriberException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(DuplicateSubscriberGroupException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors dublicateSubscriberGroupException(DuplicateSubscriberGroupException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(SubscriberNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors subscriberNotFoundException(SubscriberNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(NoDataAvailableException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors noDataAvaialbleException(NoDataAvailableException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(NoUnassignedSubscribersFoundException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors noUnassignedSubscribersFound(NoUnassignedSubscribersFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
}


