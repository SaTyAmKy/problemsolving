package Collection;
import java.util.*;
public class FilterAndCountNumberWithEnumeration {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.addAll(Arrays.asList(10,-10,-9,9,6,7,8,-2,1,0,4));
		Enumeration<Integer> e = v.elements();
		int count = 0;
		int sum = 0;
		System.out.println("All even positive numbers :");
		while(e.hasMoreElements()) {
			Integer i = e.nextElement();
			
			if(i%2 == 0 && i >0) {
				System.out.println(i);
				count++;
				sum += i;
			}
			
		}
		System.out.println("Total count :"+count);
		System.out.println("Sum of all positive even numbers :"+sum);
	}

}
