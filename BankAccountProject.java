class BankAccount{
   private String accountHolderName;
   private int AccountNumber;
   private int Balance;
	public  void setaccountHolderName(String name) {
		accountHolderName = name;
	}
	
	public String getaccoutHolderName() {
		return accountHolderName;
	}
	
	public void setAccountNumber(int ac){
		AccountNumber = ac;	
	}
	
	public int getAccountNumber() {
		return AccountNumber;
	}
	
	public void setBalance(int bl) {
		Balance = bl;
	}
	
	public int getBalance() {
		return Balance;
	}
	
	
}
public class BankAccountProject {
public static void main(String[] args) {
	BankAccount ba = new BankAccount();
	ba.setaccountHolderName("Satyam");
	ba.setAccountNumber(12345678);
	ba.setBalance(200000);
	
	System.out.println("AccountHolder Name :"+ba.getaccoutHolderName());
	System.out.println("AccountNumber :"+ba.getAccountNumber());
	System.out.println("Balance :"+ba.getBalance());
}
}
