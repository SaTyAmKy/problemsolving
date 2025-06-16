// Parent class
class Person{
	public String name;
	public String address;
	public int age;
}
// child class
class Studen extends Person{
	public int marks;
	public String grade;
	
	// Constructor
	Studen(String name,String address,int age,int marks,String grade){
		this.name = name;
		this.address = address;
		this.age = age;
		this.marks = marks;
		this.grade = grade;		
	}
	// Method
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("Age :"+age);
		System.out.println("Marks :"+marks);
		System.out.println("Grade :"+grade);
	}
}
public class InheritanceProperty {
	public static void main(String[] args) {
		Studen st = new Studen("Satyam","Nawada",21,200,"A");
		st.display();
		
	}

}
