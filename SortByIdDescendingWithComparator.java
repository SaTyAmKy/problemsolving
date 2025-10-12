package CollectionExamples;

import javax.print.attribute.standard.MediaSize.Other;
import java.util.*;

 class Student implements Comparator<Student>{
	int id;
	Student(int id){
		this.id = id;
	}
	public int compare(Student s1, Student s2) {
        return s2.id - s1.id; 
    }
	public String toString() {
		return "student id :"+id;
	}
}

public class SortByIdDescendingWithComparator {
	void showSet() {
		
		TreeSet<Student> t = new TreeSet<Student>(new Student(0)) ;
		t.add(new Student(1));	
		t.add(new Student(2));
		t.add(new Student(3));
		t.add(new Student(4));
		t.add(new Student(5));
		System.out.println(t);
			
		
	}
	public static void main(String[] args) {
		SortByIdDescendingWithComparator sdc = new SortByIdDescendingWithComparator();
		sdc.showSet();
	}

}
