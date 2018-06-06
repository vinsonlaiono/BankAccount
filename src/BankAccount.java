
public class BankAccount {
//	public String accountNumber;
	public double checkingBalance = 0;
	public double savingsBalance = 0;
	private static int numberOfAccounts;
	private static double totalBalanceAllAccounts;
	public long accountNumber;
	public long userAccountNumber = getAccountNumber();
	
	public BankAccount () {
		numberOfAccounts++;
	}
	
	// Getter for savings balance
	public double getSavings() {
		System.out.println("Savings balance: " + this.savingsBalance);
		return savingsBalance;
	}
	// Getter for checking balance
	public double getChecking() {
		System.out.println("Checking balance: " + this.checkingBalance);
		return checkingBalance;
	}
	// Getter for Total Balance of the Bank
	static double getTotalBalance() {
		System.out.println("Total amount in the Bank: " + totalBalanceAllAccounts);
		return totalBalanceAllAccounts;
	}
	// Keeps a count of how many account instances have been created
	static int getNumOfAccounts() {
		System.out.println("Number of created accounts: " + numberOfAccounts);
		return numberOfAccounts;
	}
	// Create account number 
	public long getAccountNumber() {
		long accountNumber = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		System.out.println("Bank Account Number: " + accountNumber);
		return accountNumber;
	}
	// Method that will allow a user to deposit moneu into either the checking or saving
	public void depositChecking(double amountDeposited) {
		this.checkingBalance += amountDeposited;
		totalBalanceAllAccounts += amountDeposited;
		System.out.println("Your Checking balance is now: " + this.checkingBalance);
	}
	// Method to deposit money to saving
	public void depositSavings(double amountDeposited) {
		this.savingsBalance += amountDeposited;
		totalBalanceAllAccounts += amountDeposited;
		System.out.println("Your Savings balance is now: " + this.savingsBalance);
	}
	// Method to withdraw money from checking account
	public void withdrawChecking(double amountWithdrawn) {
		// Check if there are sufficient funds in the account
		if(amountWithdrawn < this.checkingBalance) {
			this.checkingBalance -= amountWithdrawn;
			totalBalanceAllAccounts -= amountWithdrawn;
			System.out.println("Your Checking balance is now: " + this.checkingBalance);
		}else {
			System.out.println("***Insuficient Funds!***");
		}
	}
	public void withdrawSavings(double amountWithdrawn) {
		// Check if there are sufficient funds in the account
		if(amountWithdrawn < this.savingsBalance) {
			this.savingsBalance -= amountWithdrawn;
			totalBalanceAllAccounts -= amountWithdrawn;
			System.out.println("Your Savings balance is now: " + this.savingsBalance);
		}else {
			System.out.println("***Insufficient Funds!***");
		}
	}
	// Display totals of all accounts
	public double accountTotals() {
		getChecking();
		getSavings();
		double total = this.savingsBalance + this.checkingBalance;
		System.out.println("Account Totals: " + total);
		return total;
	}
}
