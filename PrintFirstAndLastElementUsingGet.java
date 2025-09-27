package Collection;

import java.util.Vector;

public class PrintFirstAndLastElementUsingGet {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(2);
		v.addElement(12);
		v.addElement(7);
		v.addElement(22);
		v.addElement(5);
		System.out.println("First Element "+v.get(0));
		System.out.println("Last Element :"+v.get(v.size()-1));
	}

}
