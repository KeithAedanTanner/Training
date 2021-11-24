package exception1;

/**
 * 
 * @author Keith Tanner
 * Title: ThrowNumberFormatException.java
 * Description: Converts a binary string into a decimal string and throws an exception if it is not a binary string.
 * 
 */
public class ThrowNumberFormatException {
	public static int binaryToDecimal(String binaryString) throws NumberFormatException {
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) < 48 || binaryString.charAt(i) > 49) // ASCII for 0 (48) and 1 (49)
			{
				throw new NumberFormatException("The string is not a binary string");
			}
		}
		int decimal = Integer.parseInt(binaryString, 2);
		return decimal;
	}

	public static void main(String[] args) {
		System.out.println(binaryToDecimal("1010")); // No exception thrown
		System.out.println(binaryToDecimal("123")); // Exception thrown
	}
}