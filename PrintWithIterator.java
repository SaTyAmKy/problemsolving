package Collection;
import java.util.*;

public class PrintWithIterator {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.addAll(Arrays.asList(10,-21,32,40,-50,97));
		
		Iterator<Integer> itr = v.iterator();
		double sum = 0;
		double count  = 0;
		
		
		int maxEle = Integer.MIN_VALUE;
		int minEle = Integer.MAX_VALUE;
		
		while(itr.hasNext()) {
			Integer i = itr.next();
			sum +=i;
			count++;
			if(i%2 == 0) {
				System.out.println(i+" is even");
			}
			else if(i%2 != 0) {
				System.out.println(i+" is odd");
			}
			if(i > maxEle) {
				maxEle = i;
			}
			if(i < minEle) {
				minEle = i;
			}
			if(i == 10) {
				itr.remove();
					
			}
				
		}
		
		double avg = sum/count;
		System.out.println("Total sum :"+sum);
		System.out.println("Total count :"+count);
		System.out.println("Average :"+avg);
		System.out.println("Maximum value :"+maxEle);
		System.out.println("Minimum value :"+minEle);
		Iterator<Integer> itr1 = v.iterator();
		while(itr1.hasNext()) {
			Integer i = itr1.next();
			if(i > 0) {
				System.out.println(i +" positive number");
			}
		    if(i < 0) {
				System.out.println(i +" Negative number");
			}
		}
	}

}
