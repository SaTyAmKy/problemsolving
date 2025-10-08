package Collection;
import java.util.*;
public class HashSetIsTheSubSetOfAnother {
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		h.addAll(Arrays.asList(10,20,30,40,50,60));
		
		HashSet<Integer> h1 = new HashSet<>();
		h1.addAll(Arrays.asList(20,30,40));
		
		System.out.println("First Set h :"+h);
		System.out.println("Second Set h1 :"+h1);
		
		if(h.containsAll(h1)) {
			System.out.println("h1 is the subset of h");
		}
		else System.out.println("h1 is not the subset of h");
		
	}

}
