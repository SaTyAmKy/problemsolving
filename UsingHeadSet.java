package CollectionExamples;
import java.util.*;
public class UsingHeadSet {
	public static void main(String[] args) {
		SortedSet<Integer> s = new TreeSet<>();
		s.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));
		System.out.println("All elements above 50 :");
		System.out.println(s.headSet(50));
	}

}
