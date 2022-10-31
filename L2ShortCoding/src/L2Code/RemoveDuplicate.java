//Remove Duplicates from Array
//Given an unsorted integer array, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.


package L2Code;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int array[] = new int[size];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the value for index: ");
			int index = scanner.nextInt();
			array[i] = index;
		}
		
		
		
		

	}

}
