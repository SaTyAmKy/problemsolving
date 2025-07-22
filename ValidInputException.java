package revision;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidInputException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		boolean validInput = false;
		while(!validInput) {
			System.out.print("Enter a valid Integer :");
			try {
			 number = sc.nextInt();
			validInput = true;
			}catch(InputMismatchException e) {
				System.out.println("Invalid input! Please enter an integer.");
				sc.nextLine();
			}
			
		}
		System.out.println("you entered a valid integer :"+ number);
		sc.close();
		
	}

}
