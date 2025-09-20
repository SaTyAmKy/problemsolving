package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoArrayListEqual {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(Arrays.asList("A","B","C"));
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.addAll(Arrays.asList("A","B","C"));
		
		
		System.out.println(al.equals(al2));
		
		
		
		
	}

}
