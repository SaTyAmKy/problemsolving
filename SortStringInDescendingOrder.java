package CollectionExamples;
import java.util.*;
class MyComparator implements Comparator<String>{

	
	public int compare(String s1, String s2) {
        
        return s2.compareTo(s1);
    }
	
	
	
}

public class SortStringInDescendingOrder {
	

	public static void main(String[] args) {
		MyComparator mc = new MyComparator();
		TreeSet<String> t = new TreeSet<>(mc);
		t.addAll(Arrays.asList("Banana", "Apple", "Mango", "Grapes"));
		System.out.println(t);
		
		
	}

}
