package oops;

/**
 * 
 * @author Keith Tanner
 * Title: Test.java
 * Description: Tests the Account, SavingsAccount, CurrentAccount, and Bank classes.
 * 
 */
public class Test {
	public static void main(String[] args) {
		// Create bank and 6 accounts
		Bank bank = new Bank(6);
		bank.accounts[0] = new Account(001, 616);
		bank.accounts[1] = new SavingsAccount(002, 680);
		bank.accounts[2] = new SavingsAccount(003, 97);
		bank.accounts[3] = new CurrentAccount(004, 669, 100);
		bank.accounts[4] = new CurrentAccount(005, 301, 200);
		bank.accounts[5] = new CurrentAccount(006, 43, 50);

		// Set interest rate
		bank.accounts[0].setAnnualInterestRate(4.5);

		// Show bank info
		bank.printAccountInfo();

		System.out.println(""); // Newline whitespace

		// Manipulate accounts to test functions
		bank.accounts[0].withdraw(195);
		bank.accounts[0].deposit(329);
		bank.accounts[0].withdraw(800);
		bank.accounts[1].withdraw(324);
		bank.accounts[1].deposit(274);
		bank.accounts[2].withdraw(798);
		bank.accounts[2].withdraw(70);
		bank.accounts[2].deposit(487);
		bank.accounts[3].withdraw(535);
		bank.accounts[3].deposit(739);
		bank.accounts[4].withdraw(444);
		bank.accounts[4].deposit(43);
		bank.accounts[5].withdraw(100);
		bank.accounts[5].withdraw(50);
		bank.accounts[5].deposit(840);

		System.out.println(""); // Newline whitespace

		// Show bank info
		bank.printAccountInfo();

		System.out.println(""); // Newline whitespace

		// Update accounts
		bank.updateAccounts();

		System.out.println(""); // Newline whitespace

		// Show bank info
		bank.printAccountInfo();
	}
}