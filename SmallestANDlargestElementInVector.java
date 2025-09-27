package Collection;

import java.util.Vector;

public class SmallestANDlargestElementInVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(12);
		v.addElement(7);
		v.addElement(22);
		v.addElement(5);
		v.addElement(18);
		int largest = v.get(0);
		int smallest = v.get(0);
		for(int ele :v) {
			if(ele > largest) {
				largest = ele;
			}
			if(ele < smallest) {
				smallest = ele;
			}
		}
		System.out.println("Largest Element :"+largest);
		System.out.println("Smallest Element :"+smallest);
	}

}
