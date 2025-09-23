package Collection;
import java.util.*;
public class SynchronizedArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		List<Integer> l= Collections.synchronizedList(al);
		l.addAll(Arrays.asList(1,2,3,4,5));
		System.out.println(al);
		synchronized(l) {
			for(int ele: l) {
				System.out.println(ele);
			}
		}
		
		
	}

}
