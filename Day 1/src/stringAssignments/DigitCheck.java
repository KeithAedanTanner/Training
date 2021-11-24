package stringAssignments;

import java.util.Scanner;

/**
 * 
 * @author Keith Tanner 
 * Title: DigitCheck.java 
 * Description: Checks if a string contains only digits.
 * 
 */
public class DigitCheck {
	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);

		// Asks for user input and reads it in
		System.out.println("Enter a string: ");
		String inputtedString = input.nextLine();
		input.close();

		int length = inputtedString.length();

		// Count the amount of characters that are digits
		for (int i = 0; i < length; i++) {
			if (inputtedString.charAt(i) >= 48 && inputtedString.charAt(i) <= 57) {
				count++;
			}
		}

		System.out.println("The inputted string was: " + inputtedString);

		if (count == length) {
			System.out.println("The string contains only digits.");
		} else {
			System.out.println("The string contains characters that aren't digits.");
		}
	}
}