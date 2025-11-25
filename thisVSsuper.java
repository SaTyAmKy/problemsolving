package coreJva;
class Parent{
	int x = 10;
	void show() {
		System.out.println("Parent show");
	}
}
class Child extends Parent{
	int x = 20;
	void show() {
		System.out.println("Child show");
	}
	void display() {
		System.out.println(this.x);
		System.out.println(super.x);
		
		this.show();
		super.show();
	}
}

public class thisVSsuper {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}

}
