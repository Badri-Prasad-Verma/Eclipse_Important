package app_java_important;
import java.util.*;
public class RandomAccess {
	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Create a Random object
        Random random = new Random();

        // Generate and add random numbers to the ArrayList
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100); // Generate a random number between 0 and 99
            numbers.add(randomNumber); // Add the random number to the ArrayList
        }

        // Print the ArrayList
        System.out.println("ArrayList: " + numbers);
    }
}
