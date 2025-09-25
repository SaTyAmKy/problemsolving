package Collection;
import java.util.Vector;

public class vectorsInList {
    public static void main(String[] args) {
        
        Vector<String> v = new Vector<>();

        
        v.add("Aman");
        v.add("Neha");
        v.add("Ravi");
        v.add("Priya");
        v.add("Satyam");

        
        
        for (String ele : v) {
            System.out.println(ele);
        }

        // 
        System.out.println( v.size());
    }
}
