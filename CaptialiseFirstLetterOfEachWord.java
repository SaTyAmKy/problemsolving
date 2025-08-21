package revision;

import java.util.Scanner;

public class CaptialiseFirstLetterOfEachWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first word :");
		String w1 = sc.next();
		
		System.out.print("Enter second word :");
		String w2 = sc.next();
		
		String first = w1.substring(0,1).toUpperCase() +  w1.substring(1);
		String second = w2.substring(0,1).toUpperCase() + w2.substring(1);
		
		System.out.println("result :"+first + " " + second);		
	}

}
