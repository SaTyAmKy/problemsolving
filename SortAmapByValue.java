package checking;
import java.util.*;
public class SortAmapByValue {
	public static void main(String[] args) {
		String str = "Java is great and Java is powerful and Java is fun";
		String[] arr = str.toLowerCase().split(" ");
		HashMap<String,Integer> h = new HashMap<>();
		for(String ele : arr) {
			h.put(ele, h.getOrDefault(ele,0)+1 );
		}
		ArrayList<HashMap.Entry<String,Integer>> al = new  ArrayList<>(h.entrySet());
		al.sort((a,b) -> b.getValue().compareTo(a.getValue()));
		
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : al) {
		    sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(sortedMap);
	}

}
