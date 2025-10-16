package checking;

import java.util.*;

public class AccessKeyValueKeyvaluePairs {
	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<>();
		h.put(101, "Satyam");
		h.put(102, "Shivam");
		h.put(103, "Rishav");
		System.out.println("All Key :"+h.keySet());
		System.out.println("All values :"+h.values());
		for(HashMap.Entry<Integer,String> ele : h.entrySet() ) {
			System.out.println(ele.getKey()+" => "+ele.getValue());
		}
	}

}
