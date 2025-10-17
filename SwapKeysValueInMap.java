package checking;
import java.util.*;
public class SwapKeysValueInMap {
	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<>();
		h.put(101,"Satyam");
		h.put(102, "shivam");
		h.put(103,"Rishav");
		System.out.println("Map :"+h);
		HashMap<String,Integer> h1 = new HashMap<>();
		for(HashMap.Entry<Integer,String> ele : h.entrySet()) {
			h1.put(ele.getValue(), ele.getKey());
				
			
		}
		System.out.println("Reversed map :"+h1);
		
	}

}
