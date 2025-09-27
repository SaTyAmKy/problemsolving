package Collection;

import java.util.Collections;
import java.util.Vector;

public class ReverseInVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(12);
		v.addElement(7);
		v.addElement(22);
		v.addElement(5);
		v.addElement(18);
		Collections.reverse(v);
		
		System.out.println(v);
}
}
