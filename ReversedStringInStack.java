package Collection;
import java.util.*;
public class ReversedStringInStack {
	public static void main(String[] args) {
		String str = "hello";
		Stack<Character> s = new Stack<>();
		
		for(char ch : str.toCharArray()) {
			s.push(ch);
		}
		StringBuilder sb = new StringBuilder();
		while(!s.isEmpty()) {
			sb.append(s.pop());
		}
		
		
		System.out.println("Reversed String :"+sb);
		
		
		 
		
	}

}
