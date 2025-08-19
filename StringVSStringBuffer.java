package javaLangPacakage;

public class StringVSStringBuffer {
	public static void main(String[] args) {
//		String s = new String("Satyam");
//		s.concat("Kumar");
//		System.out.println(s);
//		
//		
//		StringBuffer sb = new StringBuffer("Satyam");
//		sb.append(" Kumar");
//		System.out.println(sb);
		
//		Strings and StringBuffer class in terms of .equals() method
		
//		String s1 = new String("satyam");
//		String s2 = new String("satyam");
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
//		
//		StringBuffer sb1 = new StringBuffer("satyam");
//		StringBuffer sb2 = new StringBuffer("satyam");
//		System.out.println(sb1 == sb2);
//		System.out.println(sb1.equals(sb2));
		
//		find OUTPUT VALUES
		
		String s1 = new String("satyam");
		s1.concat("sofware");
		String s2 = s1.concat(" solution");
		s1 = s1.concat(" soft");
		System.out.println(s1);
		System.out.println(s2);
	}

}
