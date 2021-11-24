package stringAssignments;

import java.util.Scanner;

/**
 * 
 * @author Keith Tanner
 * Title: FirstNonRepeatChar.java
 * Description: Prints the first non-repeated character from a string.
 * 
 */
public class FirstNonRepeatChar {
	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);

		// Asks for user input and reads it in
		System.out.println("Enter a string: ");
		String inputtedString = input.nextLine();
		input.close();
		String checkString = inputtedString; // Allows modification of string while preserving original input.

		System.out.println("The inputted string was: " + inputtedString);
		// Checks for repeated characters
		for (int i = 0; i < checkString.length(); i++) {
			count = 0;
			if (checkString.charAt(i) == '0')
				continue;
			for (int j = i + 1; j < checkString.length(); j++) {
				if (checkString.charAt(i) == checkString.charAt(j)) {
					count++;
					checkString = checkString.replace(checkString.charAt(i), '0');
					break;
				}
			}
			if (count == 0) // If character is not repeated in the string
			{
				System.out.println("The first non-repeated character is " + inputtedString.charAt(i) + ".");
				break;
			}
		}
	}
}