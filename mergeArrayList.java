package Collection;

import java.util.*;

public class mergeArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(Arrays.asList(1,2,3));
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.addAll(Arrays.asList(4,5,6));
		
		
		al.addAll(al1);
		System.out.println(al);
		
		
		
		al1.addAll(al);
		Collections.sort(al1);
		LinkedHashSet<Integer> lh  = new LinkedHashSet<Integer>(al1);
		
		ArrayList al3 = new ArrayList<Integer>(lh);
		
		System.out.println(al3);
		
		
		
		
	}

}
