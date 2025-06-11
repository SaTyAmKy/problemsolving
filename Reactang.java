import java.util.Scanner;
class Rectangles{
	double length;
	double width;
	
	void setlength(double l) {
		length = l;
	}
	void setwidth(double b) {
		width = b;
	}
	
	void getarea() {
		 double area = length*width;
		 System.out.println("Area :"+area);
	}
	
	void getperimeter() {
		double perimeter = 2*(length + width);
		System.out.println("Perimeter :"+ perimeter);
	}
	
}

public class Reactang {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Rectangles r = new Rectangles();
		
		System.out.print("Enter l :");
		double l = sc.nextDouble();
		System.out.print("Enter b :");
		double b = sc.nextDouble();
		// set the values using setter method.
		r.setlength(l);
		r.setwidth(b);
		
		//Calculate and display the area.
		r.getarea();
		r.getperimeter();
		
	}

}
