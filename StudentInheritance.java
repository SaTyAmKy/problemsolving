package revision;
class Person{
	public String name;
	public String address;
	public int age;
}
class StudentIn extends Person{
	public int marks;
	public String grade;
	
	StudentIn(String name,String address,int age,int marks,String grade){
		this.name = name;
		this.address = address;
		this.age = age;
		this.marks = marks;
		this.grade = grade;	
	}
	
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("Age :"+age);
		System.out.println("Marks :"+marks);
		System.out.println("Grade :"+grade);
	}
}

public class StudentInheritance {
	public static void main(String[] args) {
		StudentIn si = new StudentIn("satyam","nawada",21,100,"A");
		si.display();
		
	}
}
