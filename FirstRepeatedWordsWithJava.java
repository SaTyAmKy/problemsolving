package checking;
import java.util.*;
public class FirstRepeatedWordsWithJava {
	public static void main(String[] args) {
		String str = "Java is great and Java is powerful and Java is fun";
		String[] arr = str.toLowerCase().split(" ");
		
		Map<String,Integer> m = new LinkedHashMap<>();
		for(String ele : arr) {
			m.put(ele, m.getOrDefault(ele,0)+1);
		}
		for(Map.Entry<String,Integer> ele : m.entrySet()) {
			if(ele.getValue() > 1) {
				System.out.println(ele.getKey());
				break;
			}
		}
		
		
	}

}
