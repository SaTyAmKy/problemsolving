package Collection;
import java.util.*;
public class EnumerationToDisplayEven {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			Integer i = e.nextElement();
			if(i%2 == 0) {
				System.out.println(i + " is even");
			}
				
			
		}
	}

}
