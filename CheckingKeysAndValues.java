package checking;

import java.util.HashMap;

public class CheckingKeysAndValues {
	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<>();
		h.put(101, "Satyam");
		h.put(102, "Shivam");
		h.put(103, "Rishav");
		System.out.println("Key 102 exist :"+h.containsKey(102));
		System.out.println("Value Rishav exist :"+h.containsValue("Rishav"));
	}

}
