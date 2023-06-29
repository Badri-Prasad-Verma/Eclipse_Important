package app_java_important;

public class ArraySorting {

	public static void main(String[] args) {
		int x[]= {12,76,34,98,45,68,32,54,25};
		int temp=0;
		for (int i = 0; i < x.length-1; i++) {
			for (int j = 0; j < x.length-1; j++) {
				if(x[j]>x[j+1]) {
					temp=x[j+1];
					x[j+1]=x[j];
					x[j]=temp;
				}
			}
		}
		for (int k : x) {
			System.out.println(k);
		}
	}
}
