package app_java_important;

public class FactorialExample {

	public static void main(String[] args) {
		int n=5;
		int fact=1;
		
		while(n!=0) {
			fact= fact*n;
			n--;		
		}
		System.out.println(fact);
	}
}
