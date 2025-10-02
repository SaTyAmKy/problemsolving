package Collection;
import java.util.*;
public class CountNameWithEnumeration {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.addAll(Arrays.asList("Satyam","Shiva","Amit","Aman","ankit"));
		Enumeration<String> e = v.elements();
		int count = 0;
		while(e.hasMoreElements()) {
			String name = e.nextElement();
			if(name.toLowerCase().charAt(0) == 'a') {
				System.out.println(name);
				count++;
			}
		}
		System.out.println("Total name starts with 'A' :"+count);
	}

}
