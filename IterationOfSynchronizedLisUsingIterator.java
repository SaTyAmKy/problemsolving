package Collection;
import java.util.*;
public class IterationOfSynchronizedLisUsingIterator {
	public static void main(String[] args) {
		List<Integer> l = Collections.synchronizedList(new ArrayList<Integer>());
		l.addAll(Arrays.asList(1,2,3,4,5));
		
		Iterator<Integer> it = l.iterator();
		synchronized(l) {
			while(it.hasNext()){
				int num = it.next();
				System.out.println(num);
			}
			
		}
		
	}

}
