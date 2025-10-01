package Collection;
import java.util.*;
public class PushAndPopInStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
		
	}

}
