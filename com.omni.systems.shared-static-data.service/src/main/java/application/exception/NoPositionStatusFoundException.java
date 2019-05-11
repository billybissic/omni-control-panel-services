/**
 * 
 */
package application.exception;

/**
 * @author Billy Bissic
 *
 */
public class NoPositionStatusFoundException extends RuntimeException {

	public NoPositionStatusFoundException() {
		super("No position status found.");
	}
}
