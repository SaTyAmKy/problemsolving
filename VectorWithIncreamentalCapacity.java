package Collection;
import java.util.*;
public class VectorWithIncreamentalCapacity {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(2,3);
		v.addElement(10);
		System.out.println("After adding element :"+v.capacity());
		v.addElement(20);
		System.out.println("After adding element :"+v.capacity());
		v.addElement(30);
		System.out.println("After adding element :"+v.capacity());
		v.addElement(40);
		System.out.println("After adding element :"+v.capacity());
		v.addElement(50);
		System.out.println("After adding element :"+v.capacity());
		
		ArrayList al = new ArrayList(v);
		System.out.println("Copied element of vector :"+ al);
		
		Vector<String> vs = new Vector<String>();
		vs.addElement("Banana");
		vs.addElement("Apple");
		vs.addElement("Mango");
		Collections.sort(vs);
		System.out.println("Sorted vector :"+vs);
		System.out.println();
	}

}
