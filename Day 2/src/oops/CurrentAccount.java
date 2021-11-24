package oops;

/**
 * 
 * @author Keith Tanner
 * Title: CurrentAccount.java
 * Description: Holds the CurrentAccount class.
 * 
 */
public class CurrentAccount extends Account {
	private double overdraftLimit;

	// Constructors
	CurrentAccount() {
		super();
		this.overdraftLimit = 0.0;
	}

	CurrentAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

	// Accessor method
	public double getOverdraftLimit() {
		return this.overdraftLimit;
	}

	// Mutator method
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	// Overriding withdraw method to allow overdrafts within the limit
	@Override
	public void withdraw(double amount) {
		if (amount > this.getBalance() && this.getBalance() - amount < (this.overdraftLimit * -1)) {
			System.out.println("Error: You tried to withdraw more than allowed on account #" + this.getId());
		} else {
			this.setBalance(this.getBalance() - amount);
		}
	}
}