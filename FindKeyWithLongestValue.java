package checking;

import java.util.HashMap;

public class FindKeyWithLongestValue {
	public static void main(String[] args) {
		
		HashMap<Integer,String> h = new HashMap<>();
		h.put(101, "Satyam");
		h.put(102, "Shivam3");
		h.put(103, "Rishav3");
		Integer maxValue = Integer.MIN_VALUE;
		Integer KeyWithLongestName = null;
		for(HashMap.Entry<Integer,String> ele : h.entrySet()) {
			if(ele.getValue().length() >= maxValue) {
				maxValue = ele.getValue().length();
				KeyWithLongestName = ele.getKey();
			}
		}
//		System.out.println(KeyWithLongestName);
		System.out.println("Map :"+h);
		System.out.println("Longest Name :"+h.get(KeyWithLongestName)+" -> "+"key :"+KeyWithLongestName);
		
	}

}
