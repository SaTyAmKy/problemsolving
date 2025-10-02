package Collection;
import java.util.*;
public class CalculateSumANDaverageWithEnumeration {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		Enumeration<Integer> e = v.elements();
		double sum = 0;
		double count= 0;
		while(e.hasMoreElements()) {
			Integer i = e.nextElement();
			sum += i;
			count++;
			
			
		}
		double d = sum/count;
		System.out.println("Total sum :"+sum);
		System.out.println("Total count :"+count);
		System.out.println("Average :"+d);
	}
	

}
