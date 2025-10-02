package Collection;
import java.util.*;
public class FindLongestNameWithEnumeration {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.addAll(Arrays.asList("Satyam","Shivam","Shudhiraa","Rishav","Balramaaa","Anuragaaa","Ankit"));
		Enumeration<String> e = v.elements();
		int maxLength = Integer.MIN_VALUE;
		ArrayList<String> al = new ArrayList<>();
		
		
		while(e.hasMoreElements()) {
			String name = e.nextElement();
			
			if(name.length() > maxLength) {
				maxLength = name.length();
				al.clear();
				al.add(name);
				
			}
			else if(name.length() == maxLength) {
				al.add(name);
			}
		}
		System.out.println(al);
		
		
	}

}
