package Collection;
import java.util.*;
public class AllEvenNumberRemoveWithIterator {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			if(i%2==0) {
				it.remove();
			}
		}
		System.out.println(al);
	}

}
