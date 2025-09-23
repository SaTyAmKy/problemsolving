package Collection;
import java.util.*;
public class InsertionAndDeletionInLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> lk = new LinkedList<Integer>();
		lk.addAll(Arrays.asList(10,20,30,40,50));
		
		lk.add(2,25);
		lk.remove(lk.indexOf(40));
		System.out.println(lk);
		
	}

}
