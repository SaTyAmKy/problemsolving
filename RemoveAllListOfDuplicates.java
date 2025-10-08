package Collection;
import java.util.*;
public class RemoveAllListOfDuplicates {
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.addAll(Arrays.asList(10,20,30,40,50,30,20));
		HashSet<Integer> h = new HashSet<>(l);
		System.out.println(h);
	}

}
