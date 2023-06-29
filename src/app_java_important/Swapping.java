package app_java_important;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Swapping {
    public static void main(String[] args) {
    	
    	List<Integer> hash=new LinkedList<Integer>();
    	hash.add(10);
    	
        int num1 = 5, num2 = 10, temp;
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        
        // Swapping
        temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}

