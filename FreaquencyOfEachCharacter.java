package checking;
import java.util.*;
public class FreaquencyOfEachCharacter {
	
	public static void main(String[] args) {
		String str = "satyamm";
		Map<Character,Integer> h = new HashMap<>();
		
		for(char ele : str.toCharArray()) {
			h.put(ele,h.getOrDefault(ele,0)+1);
		}
		System.out.println(h);
	}

}
