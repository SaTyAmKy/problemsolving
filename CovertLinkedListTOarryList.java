package Collection;
import java.util.*;
public class CovertLinkedListTOarryList {
	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Delhi");
		ls.add("Mumbai");
		ls.add("Kolkata");
		ls.add("Chennai");
		System.out.println(ls);
		ArrayList<String> al = new ArrayList<String>(ls);
		System.out.println(al);
		
		System.out.println(al.get(1));
		
	}

}
