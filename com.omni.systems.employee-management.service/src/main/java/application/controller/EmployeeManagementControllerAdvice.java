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

import application.exception.EmployeeEducationNotFoundException;
import application.exception.EmployeeEmploymentPositionNotFoundException;
import application.exception.EmployeeHistoryNotFoundException;
import application.exception.EmployeeInformationNotFoundException;
import application.exception.EmployeeReferencesNotFoundException;
import application.exception.EmployeeSignatureNotFoundException;
import application.exception.EmploymentArrangementTypeAlreadyExistsException;
import application.exception.EmploymentArrangementTypeNotFoundException;
import application.exception.EmploymentPositionTypeAlreadyExistsException;
import application.exception.EmploymentPositionTypeNotFoundException;
import application.exception.EntertainerAuditionsNotFoundException;
import application.exception.EntertainerExperienceNotFoundException;
import application.exception.EntertainerInformationNotFoundException;
import application.exception.NoDataAvailableException;

/**
 * @author Billy Bissic
 *
 */

@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class EmployeeManagementControllerAdvice {
	
	@ResponseBody
	@ExceptionHandler(EmployeeEducationNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors empoyeeEducationNotFoundException(EmployeeEducationNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EmployeeEmploymentPositionNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors employeeEmploymentPositionNotFoundException(EmployeeEmploymentPositionNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EmployeeHistoryNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors employeeHistoryNotFoundException(EmployeeHistoryNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EmployeeInformationNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors employeeInformationNotFoundException(EmployeeInformationNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EmployeeReferencesNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors employeeReferencesNotFoundException(EmployeeReferencesNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EmployeeSignatureNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors employeeSignatureNotFoundException(EmployeeSignatureNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EmploymentArrangementTypeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors employmentArrangementTypeNotFoundException(EmploymentArrangementTypeNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(EmploymentPositionTypeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors employmentPositionTypeNotFoundException(EmploymentPositionTypeNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(EntertainerAuditionsNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors entertainerAuditionsNotFoundException(EntertainerAuditionsNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(EntertainerExperienceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors entertainerExperienceNotFoundException(EntertainerExperienceNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(EntertainerInformationNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors entertainerInformationNotFoundException(EntertainerInformationNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(NoDataAvailableException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors noDataAvailableException(NoDataAvailableException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(EmploymentArrangementTypeAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors employmentArrangementTypeAlreadyExists(EmploymentArrangementTypeAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(EmploymentPositionTypeAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors employmentPositionTypeAlreadyExistsException(EmploymentPositionTypeAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
}
