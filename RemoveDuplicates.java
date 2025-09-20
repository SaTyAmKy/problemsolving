package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(Arrays.asList(10,20,30,20,10,40));
		al = al.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(al);
	}

}
