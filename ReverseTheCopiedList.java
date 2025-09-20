package Collection;

import java.util.*;

public class ReverseTheCopiedList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(Arrays.asList("Aman","Ravi","Neha","Priya"));
		System.out.println(al);
		ArrayList<String> al1 = new ArrayList<String>(al);
		Collections.reverse(al1);
		System.out.println(al1);
		
	}

}
