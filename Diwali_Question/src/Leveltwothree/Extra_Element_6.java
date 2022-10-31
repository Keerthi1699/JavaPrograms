package Leveltwothree;

import java.util.Scanner;

public class Extra_Element_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter N1 : ");
		int n1 = in.nextInt();
		
		System.out.println("Enter N2 : ");
		int n2 = in.nextInt();
		
		int A[] = new int[n1];
		int B[] = new int[n2];
		
		System.out.println("Enter N1 Elements : ");
		
		for(int i=0; i<n1; i++) {
			A[i] = in.nextInt();
		}
		
		System.out.println("Enter N2 Elements : ");
		
		for(int i=0; i<n2; i++) {
			B[i] = in.nextInt();
		}
		
		findExtraElement(A,B,n1,n2);

	}

	private static void findExtraElement(int[] A, int[] B, int n1, int n2) {
		
		int flag = 0;
		int i = 0,j = 0;
		while(i<n1 && j<n2) {
			if(A[i] == B[j]) {
				i++;
				j++;
			}
			else {
				print(A[i],i);
				flag++;
				break;
			}
		}
		
		if(flag == 0) {
			print(A[n1-1],(n1-1));
		}
		
	}

	private static void print(int value, int index) {
		
		System.out.println("In the second array, \""+ value +"\" is missing and it's index in the first array is \""+ index  + "\"");
		
	}

}