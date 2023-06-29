package app_java_important;

public class Armstrong {

	public static void main(String[] args) {
		int n=152;
		int temp=n;
		int sum=0,rem;
		
		while(n>0) {
			rem=n%10;
			sum= sum +(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
	}
}
