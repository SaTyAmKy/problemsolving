package checking;
import java.util.*;
public class FindSizeRemoveAndClearEntries {
	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<>();
		h.put(101, "Satyam");
		h.put(102, "Shivam");
		h.put(103, "Rishav");
		System.out.println("Size Of Map :"+h.size());
		h.remove(101);
		System.out.println(h);
		h.clear();
		System.out.println("Map is empty :"+h.isEmpty());
	}

}
