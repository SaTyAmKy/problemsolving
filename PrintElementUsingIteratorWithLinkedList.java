package Collection;
import java.util.*;
public class PrintElementUsingIteratorWithLinkedList {
	public static void main(String[] args) {
		LinkedList<Double> ld = new LinkedList<>();
		ld.addAll(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0));
		Iterator<Double> it = ld.iterator();
		while(it.hasNext()){
			Double d = it.next();
			System.out.println(d);
			
			
			
			
		}
		System.out.println("Using descending iterator :");
		Iterator<Double> it1 = ld.descendingIterator();
		while(it1.hasNext()) {
			Double d1 = it1.next();
			System.out.println(d1);
		}
		
		
		
	}

}
