package checking;
import java.util.*;
public class AddUpdateRemoveEntriesInMap {
	public static void main(String[] args) {
		HashMap<String,String> h = new HashMap<>();
		h.put("101", "Satyam");
		h.put("102", "Shivam");
		h.put("103", "Rishav");
		 System.out.println("Updated Value :"+ h.put("101", "Navin"));
		 h.remove("103");
		System.out.println(h);
				
	}

}
