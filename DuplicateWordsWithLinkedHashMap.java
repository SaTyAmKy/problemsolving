package checking;
import java.util.*;
public class DuplicateWordsWithLinkedHashMap {
	public static void main(String[] args) {
		String str = "AI is the future and AI is changing the world and AI is everywhere";
		String[] arr = str.toLowerCase().split(" ");
		
		LinkedHashMap<String,Integer> lk = new LinkedHashMap();
		for(String ele : arr) {
			lk.put(ele,lk.getOrDefault(ele,0)+1);
			
		}
		System.out.println("how much times word repeates :"+lk);
		System.out.println("Duplicate Words :");
		lk.forEach((key,value) -> {
			if(value > 1) {
				System.out.println(key+"---"+value);
			}
		});
		
	}
	

}
