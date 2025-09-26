package Collection;
import java.util.*;
public class AddStringInVector {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
//		v.addAll(Arrays.asList("Apple","Banana","Mango"));
		v.addElement("Apple");
		v.addElement("Banana");
		v.addElement("Mango");
		
		
		System.out.println(v); 
		System.out.println(v.firstElement());
	}

}
