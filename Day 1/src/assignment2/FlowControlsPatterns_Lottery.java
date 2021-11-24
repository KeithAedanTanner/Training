package assignment2;

import java.util.Scanner;

/**
 * 
 * @author Keith Tanner
 * Title: FlowControlsPatterns_Lottery.java
 * Description: Generates a lottery of a three-digit number. 
 * The program prompts the user to enter a three-digit number and
 * determines whether the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is
 * $10,000.
 * 2. If all the digits in the user input match all the digits in the lottery number, the
 * award is $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award is
 * $1,000.
 * 
 */
public class FlowControlsPatterns_Lottery {
	public static void main(String[] args) {
		int winningNumber = 438;
		int matchingCount = 0;

		Scanner input = new Scanner(System.in);

		// Asks for user input and reads it in
		System.out.println("Enter your 3 digit lottery number: ");
		int lotteryNumber = input.nextInt();
		input.close();

		// Check for grand prize (rule #1)
		if (lotteryNumber == winningNumber) {
			System.out.println("GRAND PRIZE!");
			System.out.println("Your lottery number matched the winning number exactly.");
			System.out.println("You win $10,000!");
		} else {
			// Find how many digits match, if any
			String winningNum = "438";
			String lotteryNum = Integer.toString(lotteryNumber);
			String temp = "";
			for (int i = 0; i < 3; i++) {
				temp = "";
				temp += winningNum.charAt(i);
				if (lotteryNum.contains(temp))
					matchingCount++;
			}

			// Check for no prize
			if (matchingCount == 0) {
				System.out.println("Sorry, your lottery number didn't match at all.");
				System.out.println("No winnings.");
			}

			// Check for second prize (rule #2)
			if (matchingCount == 3) {
				System.out.println("SECOND PRIZE!");
				System.out.println("Your lottery number matched all the winning number's digits out of order.");
				System.out.println("You win $3,000!");
			}

			// Check for third prize (rule #3)
			if (matchingCount == 1 || matchingCount == 2) {
				System.out.println("THIRD PRIZE!");
				System.out.println(
						"Your lottery number matched at least one, but not all, of the winning number's digits.");
				System.out.println("You win $1,000!");
			}
		}
	}
}