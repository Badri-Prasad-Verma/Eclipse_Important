package app_java_important;
import java.util.*;
public class FailFastAndFailSafe {
	 public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        
	        // Fail-Safe Iterator
	        Iterator<Integer> failSafeIterator = new ArrayList<>(numbers).iterator();
	        while (failSafeIterator.hasNext()) {
	            int number = failSafeIterator.next();
	            System.out.println(number);
	            // No Concurrent modification: Adding an element while iterating
	           numbers.add(7);
	        }

	        // Fail-Fast Iterator
	        Iterator<Integer> failFastIterator = numbers.iterator();
	        while (failFastIterator.hasNext()) {
	            int number = failFastIterator.next();
	            System.out.println(number);
	            // Concurrent modification: Adding an element while iterating
	            numbers.add(6);
	        }

	       }
}
