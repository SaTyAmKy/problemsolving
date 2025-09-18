package Collection;
import java.util.ArrayList;
public class LongestNameArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		String[] arr = {"Satyam","Neha","Aman","Ravi","Priyanka"};
		String longest = "";
		
		for(String ele : arr) {
			al.add(ele);
			if(ele.length() > longest.length()) {
				longest = ele;
				
			}
			
			
		}
		System.out.println("LongestName :" + longest);
		System.out.println(longest.length());
		
		
		
		
	}

}
