package basic;

import java.util.Scanner;

public class Zerontw {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n]; 
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		int temp = 0;
		System.out.println("Numbers: ");
		for(int s=0;s<arr.length;s++) {
			System.out.println(arr[s]);
		}
		for(int k=0;k<arr.length;k++) {
			for(int j=k+1;j<arr.length;j++) {

			}
		}
	}
}
