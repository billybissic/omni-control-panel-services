/**
 * 
 */
package application.exception;

/**
 * @author Billy Bissic
 *
 */
public class ApplicationTypeAlreadyExistsException extends RuntimeException {

	public ApplicationTypeAlreadyExistsException() {
		super("Application type already exists.");
	}
}
