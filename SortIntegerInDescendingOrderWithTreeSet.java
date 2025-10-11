package CollectionExamples;
import java.util.*;

import CollectionExamples.SortStudentsByIdUsingComparable.Student;
public class SortIntegerInDescendingOrderWithTreeSet {
	
	class MyNumber implements Comparable<MyNumber>{
		int number;
		
		public MyNumber(int number) {
			this.number = number;
		}
		public int compareTo(MyNumber other) {
			return other.number -this.number;
		}
		public String toString() {
			return String.valueOf(number);
		}
		
		
			}
	void showMyNumber() {
		TreeSet<MyNumber> t = new TreeSet<MyNumber>();
		t.add(new MyNumber(101));
		t.add(new MyNumber(102));
		t.add(new MyNumber(103));   
	    t.add(new MyNumber(104));
	    
	    for(MyNumber ele : t) {
	    	System.out.println(ele);
	    }
	}

	public static void main(String[] args) {
		SortIntegerInDescendingOrderWithTreeSet obj = new SortIntegerInDescendingOrderWithTreeSet();
		obj.showMyNumber();
		
	}

}
