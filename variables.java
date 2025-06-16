// Local variable
//class Calculator{
//	public void add(int a,int b) { // These parameter are the local variable.
//		int result = a + b;
//		System.out.println("Sum :"+result);
//	}
//}

// Static variable
class Loan{
	static float rate = 5.5f;
}
public class variables {
public static void main(String[] args) {
	
	//for local variable
//	Calculator cl = new Calculator();
//	cl.add(10, 20);
	
	// for static variable
	System.out.println(Loan.rate);
	System.out.println(new Loan().rate);
}
}
