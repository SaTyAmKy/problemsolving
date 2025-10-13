package CollectionExamples;
import java.util.*;
class Employee implements Comparator<Employee>{
	int id;
	String name;
	double salary;
	Employee(){
		
	}
	Employee(int id,String name,double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int compare(Employee e1, Employee e2) {
		return Double.compare(e2.salary, e1.salary);
		
	}
	public String toString() {
        return "Salary: " + salary + "  Id: " + id + "  Name: " + name;
    }
}

public class SortEmployeeBySalary {
	void display() {
        TreeSet<Employee> t = new TreeSet<>(new Employee()); //

        t.add(new Employee(1, "Satyam", 80000));
        t.add(new Employee(2, "Shivam", 75000));
        t.add(new Employee(3, "Rahul", 95000));
        t.add(new Employee(4, "Karan", 70000));
        t.add(new Employee(5, "Amit", 90000));

        for (Employee ele : t) {
            System.out.println(ele);
        }
	}
    
	public static void main(String[] args) {
		SortEmployeeBySalary ses = new SortEmployeeBySalary();
		ses.display();
	}

}
