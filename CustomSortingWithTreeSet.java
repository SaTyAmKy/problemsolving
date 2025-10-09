package CollectionExamples;
import java.util.*;


public class CustomSortingWithTreeSet {
	static class MyComparator implements Comparator{
		public int compare(Object obj1,Object obj2) {
			Integer i1 = (Integer)obj1;
			Integer i2 = (Integer)obj2;
			return i2.compareTo(i1);
		}
	}
	public static void main(String[] args) {
		MyComparator mc = new MyComparator();
		TreeSet<Integer> t = new TreeSet<>(mc);
		t.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));
		System.out.println("Descending Order :"+t);
		
	}

}
