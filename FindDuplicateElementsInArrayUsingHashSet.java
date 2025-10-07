package Collection;
import java.util.*;
public class FindDuplicateElementsInArrayUsingHashSet {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,50,40,90};
		
		HashSet<Integer> h = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();
		for(int ele : arr) {
			
			if(!h.add(ele)) {
				duplicates.add(ele);
				
			}
		}
		System.out.println(h);
		System.out.println("Duplicate ele :"+duplicates);
		
		
		
	}

}
