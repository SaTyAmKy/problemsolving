package Collection;
import java.util.*;
public class VectorIncrementingElements {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		
		System.out.println(v.isEmpty());
		System.out.println("Size :" + v.size() +" "+ "Capacity :" +v.capacity());
		
		v.addElement("Banana");
		v.addElement("Apple");
		v.addElement("Mango");
		
		
		for(Object ele : v) {
			System.out.println(ele);
		}
		System.out.println("Removed element :"+v.remove(2));
	}

}
