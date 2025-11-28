package coreJva;
class Addresses{
	String city;
	Addresses(String city){
		this.city = city;
	}
}
class Persons implements Cloneable{
	String name;
	Addresses address;
	
	Persons(String name,Addresses address){
		this.name = name;
		this.address = address;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		Persons copy = (Persons) super.clone();
		copy.address = new Addresses(this.address.city);
		return copy;
	}
}

public class DeepCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		Addresses address = new Addresses("Patna");
		Persons p1 = new Persons("Satyam",address);
		Persons p2 = (Persons) p1.clone();
		p2.address.city = "Mumbai";
		System.out.println(p1.address.city);
		System.out.println(p2.address.city);
	}

}
