package stringAssignments;

import java.util.Scanner;

/**
 * 
 * @author Keith Tanner 
 * Title: DuplicateCharacters.java 
 * Description: Prints duplicate characters from a string.
 * 
 */
public class DuplicateCharacters {
	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);

		// Asks for user input and reads it in
		System.out.println("Enter a string: ");
		String inputtedString = input.nextLine();
		input.close();
		String checkString = inputtedString; // Allows modification of string while preserving original input.

		System.out.println("The inputted string was: " + inputtedString);
		System.out.println("The duplicated characters are: ");
		// Check for duplicate characters
		for (int i = 0; i < checkString.length(); i++) {
			if (checkString.charAt(i) == '0')
				continue;
			for (int j = i + 1; j < checkString.length(); j++) {
				if (checkString.charAt(i) == checkString.charAt(j)) {
					count++;
					System.out.println(checkString.charAt(i));
					checkString = checkString.replace(checkString.charAt(i), '0');
					break;
				}
			}
		}
		if (count == 0)
			System.out.println("There were no duplicate characters."); // No duplicate characters found
	}
}