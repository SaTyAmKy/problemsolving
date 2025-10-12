package CollectionExamples;
import java.util.*;

public class SortTheString {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.addAll(Arrays.asList("Banana", "Apple", "Mango", "Grapes"));
		System.out.println(t);
	}

}
