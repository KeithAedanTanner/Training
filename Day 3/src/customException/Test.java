package customException;

/**
 * 
 * @author Keith Tanner
 * Title: Test.java
 * Description: Tests CustomException
 * 
 */
public class Test {
	public static void main(String[] args) {
		// Generates and catches an ArrayIndexOutOfBoundsException, which is a type of Runtime Exception
		int[] array = new int[0];
		try {
			System.out.println(array[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new CustomException("Testing custom exception"); // Uses the CustomException class
		}
	}
}