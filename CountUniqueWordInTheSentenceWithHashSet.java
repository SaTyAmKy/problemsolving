package Collection;
import java.util.*;
public class CountUniqueWordInTheSentenceWithHashSet {
	public static void main(String[] args) {
		String str = "counting of words with the HashSet is very easy to look HashSet";
		String[] arr = str.split(" ");
		for(String ele : arr) {
			System.out.println(ele);
		}
		
		
		HashSet<String> h = new HashSet<>();
		for(String ele : arr) {
			h.add(ele);
		}
		System.out.println("words :"+h);
		System.out.println("Number of unique element :"+h.size());
		
	}

}
