package Collection;

import java.util.Arrays;
import java.util.*;

public class DifferenceElementsBetweenTwoSetsWithHashSet {
	public static void main(String[] args) {
		HashSet<Object> h = new HashSet<Object>();
		h.addAll(Arrays.asList(10,20,30,40,50));
		
		HashSet<Object> h1 = new HashSet<Object>();
		h1.addAll(Arrays.asList(30,40,50,60,70));
		
		
		HashSet<Object> temp = new HashSet<Object>(h);
		HashSet<Object> temp1 = new HashSet<Object>(h1);
		
		temp.removeAll(h1);
		temp1.removeAll(h);
		
		temp.addAll(temp1);
		System.out.println("Symmetric Difference :"+temp);
		
		
		
		
		
		
	}

}
