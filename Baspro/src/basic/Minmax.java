package basic;

import java.util.Scanner;

public class Minmax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n]; 
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		
		int max = 0;
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("maximum value " +max);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("minimum value " +min);
	}

}
