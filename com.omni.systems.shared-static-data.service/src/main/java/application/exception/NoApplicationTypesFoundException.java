/**
 * 
 */
package application.exception;

/**
 * @author Billy Bissic
 *
 */
public class NoApplicationTypesFoundException extends RuntimeException {

	public NoApplicationTypesFoundException() {
		super("No application types found");
	}
}
