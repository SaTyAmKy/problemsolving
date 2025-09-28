package Collection;
import java.util.*;
public class UserInputNumberRemoveIT {
	public static void main(String[] args) {
		Vector<Integer> number = new Vector<>();
		number.addAll(Arrays.asList(10,20,30,40,50,40));
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Original Vector :"+number);
		System.out.print("Enter a number to remove :");
		int n = sc.nextInt();
		
		if(number.contains(n)) {
			number.remove(Integer.valueOf(n));
			System.out.println("Updated vector :"+number);
			
		}
		else {
			System.out.println("Element not found");
		}
		sc.close();
		
		
		
	}

}
