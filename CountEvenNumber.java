package Collection;

import java.util.Vector;

public class CountEvenNumber {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(12);
		v.addElement(7);
		v.addElement(22);
		v.addElement(5);
		v.addElement(18);
		int count = 0;
		System.out.print("Even number :");
		for(int ele : v) {
			if(ele%2 == 0) {
				count++;
				System.out.print( (ele + "  "));
			}
		}
		System.out.println();
		System.out.println("total numbers :"+count);
	}

}
