package assignment2;

/**
 * 
 * @author Keith Tanner
 * Title: LoopStatements.java
 * Description: Uses three for loops to print the following pattern:
 * 1******
 * 12*****
 * 123****
 * 1234***
 * 12345**
 * 123456*
 * 1234567
 * 
 */
public class LoopStatements {
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j < i + 1; ++j) {
				System.out.print(j);
			}
			for (int k = (7 - i); k > 0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}