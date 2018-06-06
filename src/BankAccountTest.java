
public class BankAccountTest {
	public static void main (String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
//		account1.getAccountNumber();
		BankAccount.getNumOfAccounts();
		
//		System.out.println(account1);
		
		account1.depositChecking(100.00);
		account1.depositSavings(200.00);
		account1.withdrawChecking(50.00);
		account1.withdrawSavings(50.00);
		
		BankAccount.getTotalBalance();
		
		account1.accountTotals();
	}
}
