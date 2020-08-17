package Session2;

import java.util.Scanner;

public class Code18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		for(int i=0; i<n; i++) 
			data[i] = sc.nextInt();
			sc.close();
			
		bubblesort(n, data);

		System.out.println("Sorted data");
		for(int i=0; i<n; i++) 
			System.out.println(data[i]);
	}
	static void bubblesort(int n, int[] data){
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(data[j] > data[j+1]) {
					//swap data[j] and data[j+1]
					swap(data[j], data[j+1]);
				}
			}
		}
	}
	static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp; 
	}
}