// 3. Given the integer array. find a sub array having the given sum given array.

package Test_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Integer_Sub_Array {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		
		int size = scanner.nextInt();
		if(size<0) {
			System.out.println("Enter the Positive Number:");
			size = scanner.nextInt();
		}
		int[] array = new int[size];
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter value for index: " +i);
			int index = scanner.nextInt();
			array[i] = index;
		}
		System.out.println("Enter the Target sum ");
		int target = scanner.nextInt();
		int[] result = subArray(array,target);
		
		System.out.println(Arrays.toString(result));
		

	}
private static int[] subArray(int[] input, int target) {
	int startIndex = 0;
	int endIndex = 0;
	outerLoop:
	for(int i=0;i<input.length;i++) {
		
		innerLoop:
		for(int j=i+1;j<input.length;j++) {
			if(sum(array(i,j,input))>target) {
				break innerLoop;
			}
			else if(sum(array(i,j,input))== target) {
				return array(i,j,input);
			}
			else if(sum(array(i,j,input))<target && target<0) {
				break innerLoop;
			}
			
		}
	}
	return null;

}

private static int[] array(int startIndex,int endIndex,int[] input) {
	int index = 0;
	int[] result = new int[(endIndex-startIndex)+1];
	
	for(int i=startIndex; i<=endIndex; i++) {
		result[index++] = input[i];
	}
	return result;
}
private static int sum(int[] array) {
	int sum=0;
	for(int i=0;i<array.length;i++) {
		sum = sum+array[i];
	}
	return sum;
}
}