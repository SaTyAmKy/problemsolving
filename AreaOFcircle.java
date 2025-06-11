import java.util.Scanner;
class Circle{
	double radius;
	void setredius(double r) {
		radius = r;
	}
	
	void getarea(){
		double area = Math.PI*radius*radius;
		System.out.println("Area :"+area);
	}
	
	void getcircumference() {
		double circumference = 2*Math.PI*radius;
		System.out.println("circumference :"+circumference);
	}
}
public class AreaOFcircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c = new Circle();
		
		System.out.print("Enter r :");
		double r = sc.nextDouble();
		c.setredius(r);
		c.getarea();
		c.getcircumference();
	}

}
