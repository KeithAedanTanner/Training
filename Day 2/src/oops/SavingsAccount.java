package oops;

/**
 * 
 * @author Keith Tanner
 * Title: SavingsAccount.java
 * Description: Holds the SavingsAccount class with method to add interest to the account.
 * 
 */
public class SavingsAccount extends Account {
	private double interest; // Interest gained monthly?

	// Constructors
	SavingsAccount() {
		super();
	}

	SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	// Accessor method
	public double getInterest() {
		return interest;
	}

	// Mutator method
	public void setInterest(double interest) {
		this.interest = interest;
	}

	// Method
	public void addInterest() {
		interest = this.getMonthlyInterest();
		this.deposit(interest);
	}
}