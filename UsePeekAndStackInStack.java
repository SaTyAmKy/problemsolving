package Collection;
import java.util.*;
public class UsePeekAndStackInStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
			System.out.println("Stack Element  :"+s.peek());
			System.out.println("Search :"+s.search(s.peek()));
			
			Integer[] arr = s.toArray(new Integer[s.size()]);
//			System.out.println(arr);// tells the referrence of the arr.
			System.out.println(Arrays.toString(arr));
	
		
	}

}
