package arrayMathException;

/**
 * 
 * @author Keith Tanner
 * Title: Test.java
 * Description: Tests the NonIntResultException and IntegerArrayMath classes.
 * 
 */
public class Test {
	public static void main(String[] args) {
		int[] num = { 4, 8, 15 };
		int[] den = { 2, 0, 4 };

		IntegerArrayMath array = new IntegerArrayMath(num, den);

		array.integerDivision();
	}
}