package CollectionExamples;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConvertToArrayWithTreeset {
	public static void main(String[] args) {
		SortedSet<Integer> s = new TreeSet<>();
		s.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));
		Object[] arr = s.toArray();
		for(Object ele : arr) {
			System.out.println(ele);
		}
	}

}
