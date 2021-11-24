package assignment2;

import java.util.Scanner;

/**
 * 
 * @author Keith Tanner
 * Title: FinacialPayRolApp.java
 * Description: Reads an employee's information and prints a payroll statement.
 * 
 */
public class FinancialPayRolApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Ask for and read user input for employee's information
		System.out.println("Enter employee's name: ");
		String employeeName = input.nextLine();
		System.out.println("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.println("Enter hourly pay rate (don't enter a $, only numerical value): ");
		double hourlyRate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate (don't enter a %, only numerical value): ");
		double fedTax = input.nextDouble();
		System.out.println("Enter state tax withholding rate (don't enter a %, only numerical value): ");
		double stateTax = input.nextDouble();

		input.close();

		// Calculates gross pay, deductions from federal and state tax, and net pay
		double grossPay = hoursWorked * hourlyRate;
		double fedTaxAmount = grossPay * (fedTax / 100);
		double stateTaxAmount = grossPay * (stateTax / 100);
		double totalTax = fedTaxAmount + stateTaxAmount;
		double netPay = grossPay - totalTax;

		// Print payroll
		System.out.println("");
		System.out.println("PAYROLL");
		System.out.println("Employee Name: " + employeeName);
		System.out.format("%s %.1f %n", "Hours Worked:", hoursWorked);
		System.out.format("%s%.2f %n", "Pay Rate: $", hourlyRate);
		System.out.format("%s%.2f %n", "Gross Pay: $", grossPay);
		System.out.println("Deductions: ");
		System.out.format("%s%.1f%s%.2f %n", "  Federal Withholding (", fedTax, "%): $", fedTaxAmount);
		System.out.format("%s%.1f%s%.2f %n", "  State Withholding (", stateTax, "%): $", stateTaxAmount);
		System.out.format("%s%.2f %n", "Total Deduction: $", totalTax);
		System.out.format("%s%.2f %n", "Net Pay: $", netPay);
	}
}