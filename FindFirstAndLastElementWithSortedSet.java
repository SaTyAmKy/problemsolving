package CollectionExamples;
import java.util.*;
public class FindFirstAndLastElementWithSortedSet {
	public static void main(String[] args) {
		SortedSet<Integer> s = new TreeSet<>();
		s.addAll(Arrays.asList(10,20,30,40,50,50,60,70));
		System.out.println(s.first());
		System.out.println(s.last());
		
	}

}
