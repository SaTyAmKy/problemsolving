package Collection;
import java.util.*;
public class CopyelementVectorIntoAnotherVector {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		
//		copy using addAll() methods
		Vector v1 = new Vector();
		v1.addAll(v);
		System.out.println(v1);
		
//		copying through constructor
		Vector v2 = new Vector(v);
		System.out.println("Copied through constructor :"+v2);
		
		System.out.println("copying through for-each loop");
		for(Object ele : v2) {
			System.out.println(ele);
		}
		
		
		
	}

}
