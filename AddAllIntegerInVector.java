package Collection;
import java.util.*;
public class AddAllIntegerInVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		int sum = 0;
		for(int ele : v) {
			
			System.out.println(ele);
			sum += ele;
		}
		System.out.println("Total sum :"+ sum);
		
	}

}
