package Collection;
import java.util.*;
public class SecondLargestNumberWithEnumeration {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.addAll(Arrays.asList(10,20,300,35,43,45));
		Enumeration<Integer> e = v.elements();
		int maxElement = Integer.MIN_VALUE;
		int secondMaxEle = Integer.MIN_VALUE;
		while(e.hasMoreElements()) {
			Integer i = e.nextElement();
			if(i > maxElement) {
				
						
				secondMaxEle = maxElement;
				maxElement = i;	
			}
			else if(i > secondMaxEle && i < maxElement) {
				secondMaxEle = i;
			}
			
			
		}
		System.out.println(secondMaxEle);
	}

}
