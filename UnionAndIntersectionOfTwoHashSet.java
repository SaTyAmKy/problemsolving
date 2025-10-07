package Collection;

import java.util.Arrays;
import java.util.HashSet;

public class UnionAndIntersectionOfTwoHashSet {
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		h.addAll(Arrays.asList(10,20,30,40,50));
		
		HashSet<Integer> h1 = new HashSet<>();
		h1.addAll(Arrays.asList(40,50,60,70,80));
		
		HashSet<Integer> union = new HashSet<Integer>(h);
		HashSet<Integer> intersection = new HashSet<Integer>(h1);
		union.addAll(h1);
		intersection.retainAll(h);
		System.out.println("Union :"+union);
		System.out.println("Intersection :"+intersection);
		
		
	}

}
