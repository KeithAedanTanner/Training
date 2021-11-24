package arrayMathException;

/**
 * 
 * @author Keith Tanner
 * Title: NonIntResultException.java
 * Description: Creates an exception if the result of division is not an integer
 * 
 */
public class NonIntResultException extends Exception {
	private String message;

	public NonIntResultException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}