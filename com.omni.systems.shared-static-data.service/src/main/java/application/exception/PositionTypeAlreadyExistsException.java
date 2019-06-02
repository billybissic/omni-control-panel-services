/**
 * 
 */
package application.exception;

/**
 * @author lahjeqii
 *
 */
public class PositionTypeAlreadyExistsException extends RuntimeException {

	public PositionTypeAlreadyExistsException() {
		super("Position type already exists.");
	}
}
