package Collection;

import java.util.*;
import java.util.Arrays;

public class SumEachElementInStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(50);
		s.push(40);
		Integer[] arr = s.toArray(new Integer[s.size()]);
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));
		int i = 0;
		int max = 0;
		int count = 0;
		while(!s.isEmpty()) {
			if(s.peek() > max) {
				max = s.peek();
			}
			
			i += s.pop();
			count++;
				
		}
		System.out.println("Total Value :"+ i);
		System.out.println("Max Value :"+ max);
		System.out.println("Count :"+ count);
		
		
		
	}

}
