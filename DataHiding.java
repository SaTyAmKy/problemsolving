import java.util.Scanner;
class Account{
	private String name;
	private double balance;
	
	void setName(String name) {
		this.name = name; 
	}
	
	void setBalance(double balance) {
		this.balance = balance;
	}
	
	String getName() {
		return name;
	}
	
	double getBalance(int pin) {
		if(pin == 1234) {
			return balance;
		}
		else {
			System.out.println("Access denied");
			return 0.0;
		}
		
	}
}
public class DataHiding {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setName("Satyam");
		a1.setBalance(20000);
		
		
		System.out.println("Username :"+a1.getName());
		System.out.println("balance :"+a1.getBalance(1234));
	}

}
