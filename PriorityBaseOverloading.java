class Sample{
	public void methodOne(String s) {
		System.out.println("String version...");
	}
	
	public void methodOne(Object o) {
		System.out.println("Object version...");
	}
	
//	public void methodOne(StringBuffer o) {
//		System.out.println("StringBuffer version ..."); 
//		
//	}
	
}
public class PriorityBaseOverloading {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.methodOne("satyam");
		s.methodOne(new Object());
		s.methodOne(null);//if we compare between String and Object ,then compiler gives the string has more priority.
		
//		s.methodOne("satyam");
//		s.methodOne(new StringBuffer("rishav"));
//		s.methodOne(null);// if we compare between String and StringBuffer, then there is a 'Ambigous error' because string and stringBuffer both are child.
	}

}
