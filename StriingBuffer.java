package javaLangPacakage;

public class StriingBuffer {
	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer();
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
//		System.out.println(sb.append("abcdefghijklmnop"));
//		
//		System.out.println(sb.append("q"));
//		System.out.println(sb.capacity());
		
//		StringBuffer sb = new StringBuffer(1000);
//		System.out.println(sb.capacity());
		
//		StringBuffer sb = new StringBuffer("Satyam");
//		System.out.println(sb.capacity());
//		System.out.println(sb.charAt(3));
//		sb.setCharAt(2, 'a');
//		System.out.println(sb);
//		System.out.println(sb.append(" kumar"));
//		System.out.println(sb.append('a'));
//		System.out.println(sb.append(90));
//		System.out.println(sb.append(3.145));
//		System.out.println(sb.insert(2,"qwert"));
//		System.out.println(sb.delete(2, 6));
//		System.out.println(sb.deleteCharAt(13));
//		System.out.println(sb.reverse());
//		sb.setLength(12);
//		System.out.println(sb);
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.ensureCapacity(1000);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		
	}

}
