package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractSublist {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(Arrays.asList(10,20,30,40,50));
		System.out.println(al.subList(1, 5));
	}

}
