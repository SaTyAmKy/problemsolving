package Collection;


import java.util.HashSet;
import java.util.*;
import java.util.Arrays;

public class CommonElementFinder {
	public static void main(String[] args) {
		HashSet<Object> h = new HashSet<Object>();
		h.addAll(Arrays.asList(10,20,30,'q','w',40,50));
		System.out.println("Before retainAll :"+h);
		
		HashSet h1 = new HashSet();
		h1.addAll(Arrays.asList('q','w',40,50,70,80));
		
		
		h.retainAll(h1);
		System.out.println("After retainAll :"+h);
		
		
		
	}

}
