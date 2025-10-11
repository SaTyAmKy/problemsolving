package CollectionExamples;
import java.util.*;

public class SortStudentsByIdUsingComparable {
	static class Student implements Comparable<Student>{
		int id;
		String name;
		public Student(int id,String name) {
			this.id= id;
			this.name= name;
		}
		public int compareTo(Student other) {
			return other.id-this.id;
		}
		  public String toString() {
		        return "Student{id=" + id + ", name='" + name + "'}";
		    }
	}
	
	public static void main(String[] args) {
		
		
		TreeSet<Student> t = new TreeSet<>();
		t.add(new Student(101,"Satyam"));
		t.add(new Student(102,"Shivam"));
		t.add(new Student(103, "Rahul"));   
	    t.add(new Student(104, "Harsh"));
		for(Object ele : t) {
			System.out.println(ele);
		}
		
		
	}

}
