package Collection;

import java.util.ArrayList;

public class searchInArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Delhi");
		al.add("Mumbai");
		al.add("Chennai");
		al.add("Kolkata");
		System.out.println(al);
		ArrayList<String> al1 = new ArrayList<String>(al);
		System.out.println(al1.contains("Mumbai"));
		System.out.println(al1);
	}

}
