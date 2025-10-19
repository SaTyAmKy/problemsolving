package checking;
import java.util.*;
public class PreserveTheInsertionOrderWithLinkedHashMap {
	public static void main(String[] args) {
		String str = "Java is great and Java is powerful and Java is fun";
		String[] arr = str.toLowerCase().split(" ");

		LinkedHashMap<String,Integer> h = new LinkedHashMap<>();
		for(String ele : arr) {
			h.put(ele, h.getOrDefault(ele,0)+1);
			
		}
		System.out.println(h);
		
		
		
		
		
	}

}
