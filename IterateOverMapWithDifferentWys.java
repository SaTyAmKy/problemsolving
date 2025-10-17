package checking;

import java.util.HashMap;

public class IterateOverMapWithDifferentWys {
	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<>();
		h.put(101, "Satyam");
		h.put(102, "Shivam");
		h.put(103, "Rishav");
		System.out.println("Find element with entrySet()");
		for(HashMap.Entry<Integer,String> ele : h.entrySet()) {
			System.out.println(ele);
		}
		System.out.println();
		System.out.println("Using keyset() :");
		for(Integer ele : h.keySet()) {
			System.out.println(ele+ "=>"+h.get(ele));
		}
		System.out.println();
		System.out.println("Using forEach method");
		h.forEach((key,value) -> {
			System.out.println(key + "=>"+ value);
			
		});
		
	}

}
