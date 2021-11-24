package customException;

/**
 * 
 * @author Keith Tanner
 * Title: CustomException.java
 * Description: A child class of a runtime exception that that takes a String argument and stores it inside the object with a String reference.
 * It contains a method that prints out the stored String. 
 * 
 */
public class CustomException extends RuntimeException {
	private String string;

	public CustomException() {
	}

	public CustomException(String string) {
		super(string);
		this.string = string;
	}

	public void display() {
		System.out.println(string);
	}
}