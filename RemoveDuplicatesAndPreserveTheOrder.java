package checking;
import java.util.*;
public class RemoveDuplicatesAndPreserveTheOrder {
	public static void main(String[] args) {
		String str = "Java is great and Java is powerful and Java is fun"; 
		String[] arr = str.toLowerCase().split(" ");
		
		LinkedHashMap<String,Boolean> lm = new LinkedHashMap<>();
		for(String ele : arr) {
			lm.put(ele,true);
		}
		System.out.println(lm.keySet());
		
	}

}