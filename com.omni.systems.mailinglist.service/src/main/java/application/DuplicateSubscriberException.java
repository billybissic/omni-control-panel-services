package application;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DuplicateSubscriberException extends RuntimeException {

	public DuplicateSubscriberException(String exception) {
		super(exception);
	}
}
