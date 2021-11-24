package oops;

/**
 * 
 * @author Keith Tanner
 * Title: Bank.java
 * Description: Holds the Bank class with method to update accounts.
 * 
 */
public class Bank {
	Account[] accounts;

	public Bank(int numOfAccounts) {
		this.accounts = new Account[numOfAccounts];
	}

	public void updateAccounts() {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] instanceof SavingsAccount) {
				SavingsAccount account = (SavingsAccount) accounts[i];
				account.addInterest();
				accounts[i] = account;
			}
			if (accounts[i] instanceof CurrentAccount) {
				CurrentAccount account = (CurrentAccount) accounts[i];
				if (account.getBalance() < 0) {
					System.out.format("The account #%d is in overdraft with a balance of $%.2f.\n", account.getId(),
							account.getBalance());
				}
			}
		}
	}

	public void printAccountInfo() {
		System.out.println("Annual Interest Rate for Accounts: " + accounts[0].getAnnualInterestRate() + "%\n");
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Account ID: " + accounts[i].getId());
			System.out.format("  Balance: $%.2f\n", accounts[i].getBalance());
			System.out.println("  Date of Account Creation: " + accounts[i].getDate());
		}
	}
}
/*
The Bank class requires methods for opening and closing accounts, and for paying a dividend into each account.
*/