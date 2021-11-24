package assignment2;

import java.util.Scanner; 

/**
 * 
 * @author Keith Tanner
 * Title: Datatypes_operators.java
 * Description: Calculates the squares and cubes of between two numbers and prints the resulting values in table format.
 * 
 */
public class Datatypes_operators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Asks for user input
		System.out.println("Enter two integers, the first smaller than the second: ");

		// Reads in the two integers
		int first = input.nextInt();
		int last = input.nextInt();

		input.close();

		// Format, calculate, and print output
		System.out.format("%n%-5s %-5s %-5s %n", "#", "#²", "#³");
		System.out.println("------------------");

		for (int i = first; i < last + 1; i++) {
			System.out.format("%-5d %-5d %-5d %n", i, i * i, i * i * i);
		}
	}
}