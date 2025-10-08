package Collection;
import java.util.*;
public class SortAHashASet {
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		h.addAll(Arrays.asList(10,20,40,30,50,30,20));
		java.util.TreeSet<Integer> t = new java.util.TreeSet<>();
		t.addAll(h);
		System.out.println("Sorted HashSet :"+t);
		
	}

}
