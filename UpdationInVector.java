package Collection;

import java.util.Vector;

public class UpdationInVector {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		v.addElement("Red");
		v.addElement("Blue");
		v.addElement("Green");
		System.out.println(v.lastElement());
		System.out.println(v.set(1,"Yellow"));
		System.out.println(v);
		
		
	}

}
