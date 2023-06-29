package app_java_important;

import java.util.Scanner;

public class PolindromeExample {
	
	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter any number");
			int n=scan.nextInt();
			int temp=n,reverse=0,rem;
			
			while(n!=0) {
				rem=n%10;
				reverse=reverse*10+rem;
				n=n/10;
			}
			if(temp==reverse) {
				System.out.println("number is polindrom");
			}
			else {
				System.out.println("number is not polindrom");
			}
		}
	}
