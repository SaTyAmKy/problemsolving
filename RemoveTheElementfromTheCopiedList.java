package Collection;
import java.util.*;
public class RemoveTheElementfromTheCopiedList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(30);
		al.add(30);
		al.add(50);
		System.out.println(al);
		ArrayList<Integer> al1 = new ArrayList<Integer>(al);
		al1.remove(Integer.valueOf(30));
		al1.removeAll(Collections.singleton(30));
		System.out.println(al1);
		
		
		
	}

}
