package app_java_important;

import java.util.Scanner;

public class NumberIsDividedOutput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

            if (n % 3 == 0 && n % 5 == 0) {
                int cube = n * n * n;
                System.out.println(n + " is divisible by both 3 and 5. Cube: " + cube);
            } else if (n % 3 == 0) {
                int square = n * n;
                System.out.println(n + " is divisible by 3. Square: " + square);
            } else if (n % 5 == 0) {
                double root = Math.sqrt(n);
                System.out.println(n + " is divisible by 5. Square Root: " + root);
        }
	}
}
