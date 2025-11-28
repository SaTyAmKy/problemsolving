package coreJva;
class Address{
	String city;
	Address(String city){
		this.city = city;
	}
}
class Person implements Cloneable{
	String name;
	Address address;
	
	Person(String name,Address address){
		this.name = name;
		this.address = address;
	}
	// shallow copy
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}

public class ShallowCopy{
	public static void main(String[] args) throws CloneNotSupportedException{
		Address address = new Address("Delhi");
		Person p = new Person("Satyam",address);
		Person p1 = (Person) p.clone();
		p1.address.city="Patna";
		System.out.println(p1.address.city);
		System.out.println(p.address.city);
	}

}
