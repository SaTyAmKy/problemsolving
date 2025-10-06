package Collection;

import java.util.Arrays;
import java.util.HashSet;

public class SymmetricDifferenceWithHashSet {
	public static void main(String[] args) {
		HashSet<Object> h = new HashSet<Object>();
h.addAll(Arrays.asList(10,20,30,40,50));
		
		HashSet<Object> h1 = new HashSet<Object>();
		h1.addAll(Arrays.asList(30,40,50,60,70));
		
		h.removeAll(h1);
		
		System.out.println("Elements Present in h not in h1"+h);
	}

}
