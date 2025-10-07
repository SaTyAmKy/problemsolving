package Collection;

import java.util.Arrays;
import java.util.HashSet;

public class CompareTwoHashSet {
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		h.addAll(Arrays.asList(10,20,30,40,50));
		HashSet<Integer> h1 = new HashSet<>();
		h1.addAll(Arrays.asList(10,20,30,40,50));
		if(h.equals(h1)) {
			System.out.println("h is equal to h1.");
		}
		else System.out.println("h is not equal to h1.");
	}

}
