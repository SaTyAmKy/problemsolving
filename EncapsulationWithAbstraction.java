package checking;

class BankAccount{
	private String accountNumber;
	private double balance;
	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}
}
 abstract class LoanService{
	public abstract boolean checkEligibility(double income,int creditScore);
	public void processLoan() {
		System.out.println("Successfully granted.");
	}
}
 class Homeloan extends LoanService{
	public boolean checkEligibility(double income,int creditScore) {
		return income > 50000 && creditScore > 700;
	}
}
public class EncapsulationWithAbstraction {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("AC12345");
		account.deposit(50000);
		account.withdraw(20000);
		System.out.println(account.getBalance());
		LoanService loan= new Homeloan();
		if(loan.checkEligibility(80000, 750)) {
			loan.processLoan();
		}
		else {
			System.out.println("Loan Rejected");
		}
	}

}
