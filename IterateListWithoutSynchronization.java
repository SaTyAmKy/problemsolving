package Collection;
import java.util.*;
public class IterateListWithoutSynchronization {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		List<Integer> l = Collections.synchronizedList(al);
		
		l.addAll(Arrays.asList(1,2));
		
		for(int ele: l) {
			System.out.println(ele);
		}
	}

}
