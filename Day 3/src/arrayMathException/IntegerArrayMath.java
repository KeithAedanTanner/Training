package arrayMathException;

import java.util.Arrays;

/**
 * 
 * @author Keith Tanner
 * Title: IntegerArrayMath.java
 * Description: Loops through 2 arrays of equal size and divides the numerators by denominators. 
 * Throws exceptions if the result is not an integer and handles it along with divide by zero exception.
 * 
 */
public class IntegerArrayMath {
	int[] numerator;
	int[] denominator;

	// Constructor
	IntegerArrayMath(int[] numerator, int[] denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public void integerDivision() {
		System.out.println("The numerators are " + Arrays.toString(numerator) + " and the denominators are "
				+ Arrays.toString(denominator) + ".");
		System.out.println("The resulting output would be: ");

		for (int i = 0; i < numerator.length; i++) {
			try {
				if (numerator[i] % denominator[i] != 0) {
					throw new NonIntResultException("Error: The result " + numerator[i] + " divided by "
							+ denominator[i] + " is not an integer.");
				}
				System.out.println(numerator[i] + "/" + denominator[i] + " is " + numerator[i] / denominator[i]);
			} catch (NonIntResultException e) {
				System.out.println(e.getMessage());
			} catch (ArithmeticException e) {
				System.out.println("Error: Division by zero is undefined.");
			}
		}
	}
}