package revision;
class Account{
	// Data security
	private double balance;
	
	public double getBalance(double balance) {
		// Withdrawing money
		
		boolean result = validate("Satyam","satyam123");
		if(result == true) {
			// Withdraw money
			this.balance = this.balance - balance ;
			return this.balance;
			
			
		}
		else {
			System.out.println("Invalid input");
		}
	return 0.0;
	}
	
	public void setBalance(double balance) {
		//Perform authentication
	boolean result = validate("Satyam","satyam123");
		// Depositing money
	if(result == true) {
		//Deposite the money
		this.balance = this.balance + balance;
		System.out.println("Credited in your account.");
	}
	else {
		//throw the meaningful message to the user.
		System.out.println("Invalid input.");
	}
	}
	 private boolean validate(String username,String password) {
		 // for authentication
		 return username.equalsIgnoreCase("Satyam") && password.equals("satyam123");
		
	 }
}

public class testDatahiding {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setBalance(10000.0);
		double xyz = acc.getBalance(100);
		System.out.println("Withdraw money :"+xyz);
		
		
	}

}
