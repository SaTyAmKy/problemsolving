package Collection;
import java.util.ArrayList;
public class StringArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		String[] arr = {"Satyam","Neha","Aman","Ravi"};
		for(String ele: arr) {
			
			al.add(ele);
			
		}
		
		if(al.contains("Neha")) {
			System.out.println("Neha is present");
		}
		else System.out.println("Neha is not present");
		System.out.println(al);
		
		
	}

}
