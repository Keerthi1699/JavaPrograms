//2. Array of integers rearrange shift zero to end

package basicstrpattern;

import java.util.Scanner;

public class Arrzero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numbers: ");
		
		int n = scanner.nextInt();
		int[] arr = new int[n]; 
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int f = arr.length;
		
		arrModify(arr, n);
		System.out.print("Modified: ");
		pArr(arr,n);

	}
	public static void shiZer(int arr[], int n) {
		int count = 0;
		
		for(int i=0; i<n; i++)
			if(arr[i] != 0)
				arr[count++] = arr[i];
		while(count < n)
			arr[count++] = 0;
	}
	public static void arrModify(int arr[], int n) {
		if(n==1)
			return;
		
		for(int i=0; i<n-1; i++) {
			if((arr[i] != 0) && (arr[i] == arr[i+1])) {
				arr[i] = 2*arr[i];
				arr[i+1] = 0;
				i++;
			}
		}
		shiZer(arr,n);
	}
	public static void pArr(int arr[], int n) {
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

}
