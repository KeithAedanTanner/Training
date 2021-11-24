package oops;

import java.util.Date;

/**
 * 
 * @author Keith Tanner
 * Title: Account.java
 * Description: Holds the Account class with methods to withdraw from and deposit to the account.
 * 
 */
public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate; // Current interest rate (same for all accounts
	private Date date; // Account creation date

	// Constructors
	Account() {
		this.id = 0;
		this.balance = 0;
		this.date = new Date();
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.date = new Date();
	}

	// Accessor methods
	public int getId() {
		return this.id;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Date getDate() {
		return this.date;
	}

	// Mutator methods
	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	// Methods
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12; // % annual rate divided by 12 months
	}

	public double getMonthlyInterest() {
		return this.balance * (getMonthlyInterestRate() / 100); // % monthly interest divided by 100
	}

	public void withdraw(double amount) {
		if (amount > this.balance) {
			System.out.println("Error: You tried to withdraw more than the account balance has on account #"+this.id);
		} else {
			this.balance -= amount;
		}
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
}