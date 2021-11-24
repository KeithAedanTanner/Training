package assignment2;

import java.util.Scanner;

/**
 * 
 * @author Keith Tanner
 * Title: FlowControlsPatterns_Numbers.java
 * Description: Reads an unspecified number of integers, determines how many
 * positive and negative values have been read, and computes the total and average of
 * the input values (not counting zeros). 
 * 
 */
public class FlowControlsPatterns_Numbers {
	public static void main(String[] args) {
		int posCount = 0;
		int negCount = 0;
		int count = 0;
		int sum = 0;
		double average = 0.0;

		Scanner input = new Scanner(System.in);
		int inNum;
		boolean check = true; // Checks if a 0 was inputted. If 0 is inputted, check is set to false.

		// Asks for user input
		System.out.println("Enter an integer, the input ends if it is 0: ");

		// User input until 0 is inputted
		while (check) {
			inNum = input.nextInt();
			if (inNum == 0)
				check = false;
			else {
				if (inNum > 0)
					posCount++;
				else
					negCount++;
				sum += inNum;
				count++;
			}
		}

		input.close();

		if (count == 0)
			System.out.println("No numbers are entered except 0."); // If only 0 was entered
		// Otherwise show stats
		else {
			average = (double) sum / (double) count;

			System.out.println("The number of positives is " + posCount);
			System.out.println("The number of negatives is " + negCount);
			System.out.println("The total is " + sum);
			System.out.println("The average is " + average);
		}
	}
}