//8. No of Occurrences

package basicstrpattern;

import java.util.Scanner;

public class Noofoccurrence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numbers: ");
		
		int n = scanner.nextInt();
		int[] arr = new int[n]; 
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int[] va = new int[arr.length];
		int v = -1;
		
		for(int i = 0; i < arr.length; i++) {
			int count = 1;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					va[j] = v;
				}
			}
			if(va[i] != v) {
				va[i] = count;
			}
		}
		for(int i = 0; i<va.length; i++) {
			if(va[i] != v) {
				System.out.println("No of Occurrences: " +arr[i]+" - " +va[i]);
			}
		}
	}

}
