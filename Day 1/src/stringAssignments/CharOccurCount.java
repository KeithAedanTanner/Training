package stringAssignments;

import java.util.Scanner;

/**
 * 
 * @author Keith Tanner
 * Title: CharOccurCount.java
 * Description: Counts the occurrence of a given character in a string.
 * 
 */
public class CharOccurCount {
	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);

		// Asks for user input and reads it in
		System.out.println("Enter a string: ");
		String inputtedString = input.nextLine();
		input.close();
		String checkString = inputtedString; // Allows modification of string while preserving original input.

		System.out.println("The inputted string was: " + inputtedString);
		System.out.println("The occurences of each character are: ");
		// Finds how many times each character occurs
		for (int i = 0; i < checkString.length(); i++) {
			if (checkString.charAt(i) == '0')
				continue;
			count = 0;
			for (int j = i; j < checkString.length(); j++) {
				if (checkString.charAt(i) == checkString.charAt(j)) {
					count++;
				}
			}
			checkString = checkString.replace(checkString.charAt(i), '0');
			System.out.println("The character '" + inputtedString.charAt(i) + "' occurs " + count + " times.");
		}
	}
}