package CollectionExamples;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class UseseOfSubSet {
	public static void main(String[] args) {
		SortedSet<Integer> s = new TreeSet<>();
		s.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));
		System.out.println("Allelements between 20 and 70:");
		System.out.println(s.subSet(20,70));
	}

}
