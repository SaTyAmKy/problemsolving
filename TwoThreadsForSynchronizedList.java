package Collection;
import java.util.*;
public class TwoThreadsForSynchronizedList {
	public static void main(String[] args) {
		List<Integer> l = Collections.synchronizedList(new ArrayList<Integer>());
		
		l.addAll(Arrays.asList(1,2,3,4,5));
		l.addAll(Arrays.asList(6,7,8,9,10));
		
		synchronized(l) {
			for(int ele : l) {
				System.out.println(ele);
			}
		}
	}

}
