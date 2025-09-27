package Collection;

import java.util.Vector;

public class VectorWithSizeAdCapacity {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(2);
		v.addElement(5);
		v.addElement(15);
		v.addElement(25);
		v.addElement(35);
		System.out.println("Size: " + v.size() + " Capacity: " + v.capacity());
 
	}

}
