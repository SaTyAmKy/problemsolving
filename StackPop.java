package Collection;
import java.util.*;
public class StackPop {
	public static void main(String[] args) {
		Stack<Integer> sk = new Stack<>();
		sk.push(10);
		sk.push(20);
		sk.push(30);
		System.out.println(sk);
		sk.pop();
		System.out.println(sk);
	}

}
