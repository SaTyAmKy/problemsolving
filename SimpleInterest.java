import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principle amount :");
		int p = sc.nextInt();
		System.out.print("Enter the rate of interest :");
		int r = sc.nextInt();
		System.out.print("Enter the time :");
		int t = sc.nextInt();
		double SI = (p*r*t)/100;
		System.out.println("Simple interest :"+SI);
	}

}
