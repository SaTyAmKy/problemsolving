package Collection;
import java.util.*;
public class ConvertHashSetToArray {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		h.addAll(Arrays.asList("Red","Blue","Green","Yellow","Gray"));
		
		String[] arr = h.toArray(new String[h.size()]);
		for(String ele: arr) {
			System.out.println(ele);
		}
	}

}
