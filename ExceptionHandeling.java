package revision;

import java.util.Scanner;

public class ExceptionHandeling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number :");
		int n1 = sc.nextInt(); 
		
		System.out.print("Enter second number :");
		int n2 = sc.nextInt();
		try {
			System.out.println(n1/n2);	
		}catch(ArithmeticException e) {
			System.out.println("Invalid Input");
		}
		
		System.out.println(n1*n2);
		System.out.println(n1-n2);
		System.out.println(n1+n2);
	}

}
