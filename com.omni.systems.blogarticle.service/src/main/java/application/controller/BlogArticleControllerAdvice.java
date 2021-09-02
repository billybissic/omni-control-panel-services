/**
 * 
 */
package application.controller;

import org.springframework.hateoas.VndErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import application.exception.ArticleCategoryNotFoundException;

/**
 * @author Billy Bissic billy@rpl.org
 *
 */
@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class BlogArticleControllerAdvice {

	@ResponseBody
	@ExceptionHandler()
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors articleCategoryNotFoundException(ArticleCategoryNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	
}
