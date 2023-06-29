package app_java_important;

public class FibonacciExample {
	public static void main(String[] args) {
		int x=10;
		System.out.println("Fibonnaci service as the " +x+ " term");
		
		for (int i = 0; i <x; i++) {
			System.out.println(fibonnaci(i)+" ");
		}
	}
	private static int fibonnaci(int k) {
		if(k<=1) {
			return k;
		}else {
		return 	fibonnaci(k-1)+fibonnaci(k-2);
		}
	}
}
