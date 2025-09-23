package Collection;
import java.util.*;

public class UsesOfIterates {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		List l = Collections.synchronizedList(al);
		l.addAll(Arrays.asList(1,2,3,4,5));
		synchronized(l) {
			Iterator<Integer> it = l.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		synchronized(l) {
			l.addAll(Arrays.asList(6,7,8,9,10));
			Iterator<Integer> it1 = l.iterator();
			while(it1.hasNext()) {
				System.out.println(it1.next());
			}
		}
		
			
		
		
	}

}
