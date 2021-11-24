package stringAssignments;

import java.util.Scanner;

/**
 * 
 * @author Keith Tanner
 * Title: RemoveDuplicates.java
 * Description: Removes the duplicates in a string.
 * 
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);

		// Asks for user input and reads it in
		System.out.println("Enter a string: ");
		String inputtedString = input.nextLine();
		input.close();
		String checkString = inputtedString; // Allows modification of string while preserving original input.
		String newString = "";

		System.out.println("The inputted string was: " + inputtedString);
		// Creates a new string without duplicated characters
		for (int i = 0; i < checkString.length(); i++) {
			if (checkString.charAt(i) == '0')
				continue;
			// Finds duplicated characters
			for (int j = i + 1; j < checkString.length(); j++) {
				if (checkString.charAt(i) == checkString.charAt(j)) {
					count++;
					checkString = checkString.replace(checkString.charAt(i), '0');
					break;
				}
			}
			newString += inputtedString.charAt(i);
		}
		if (count == 0) // If no duplicates were found
		{
			System.out.println("There were no duplicate characters.");
		}
		System.out.println("The new string without duplicated characters is: " + newString);
	}
}