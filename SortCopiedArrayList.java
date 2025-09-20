package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortCopiedArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(25);
		al.add(5);
		al.add(15);
		al.add(10);
		System.out.println(al);
		ArrayList<Integer> al1 = new ArrayList<Integer>(al);
		
		
//		with the help of Utility Method
		Collections.sort(al1);
		
		
		System.out.println(al1);
		
	}

}
