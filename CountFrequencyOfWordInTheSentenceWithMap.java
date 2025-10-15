package checking;
import java.util.*;
public class CountFrequencyOfWordInTheSentenceWithMap {
	public static void main(String[] args) {
		String str =  "I love Java because I love coding";
		String[] word = str.split(" ");
		HashMap<String , Integer> h = new HashMap();
		for(String ele : word) {
			h.put(ele, h.getOrDefault(ele,0)+1);
		}
		System.out.println(h);
	}

}
