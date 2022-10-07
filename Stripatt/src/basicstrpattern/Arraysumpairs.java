//4. Check pair with sum

package basicstrpattern;

import java.util.Scanner;

public class Arraysumpairs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values:" );
		
		int n = scanner.nextInt();
		int[] arr = new int[n]; 
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Sum of values : ");
		int sum = scanner.nextInt();
		
		int l = 0;
		int h = arr.length-1;
		
		while(l < h) {
			if(arr[l] + arr[h] > sum) {
				h--;
			}
			else if(arr[l] + arr[h] < sum){
				l++;
			}
			else if((arr[l] + arr[h]) == sum) {
				System.out.println("pairs (" + arr[l] + "," + arr[h] + ")");
				l++;
				h--;
			}
		}
		

	}

}
