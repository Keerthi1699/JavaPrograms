package Leveltwothree;

import java.util.ArrayList;
import java.util.Scanner;

public class MedianTwoSortedArray_9 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter N1 : ");
		int n1 = in.nextInt();
		System.out.println("Enter N2 : ");
		int n2 = in.nextInt();
		                                        
		int A[] = new int[n1];
		int B[] = new int[n2];

		System.out.println("Enter N1 Elements : ");

		for (int i = 0; i < n1; i++) {
			A[i] = in.nextInt();
		}
		System.out.println("Enter N2 Elements : ");

		for (int i = 0; i < n2; i++) {
			B[i] = in.nextInt();
		}

		mergeArray(A, B, n1, n2);
	
	}
	
	private static void mergeArray(int[] A, int[] B, int n1, int n2) {

		ArrayList<Integer> C = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (i < n1 && j < n2) {
			if (A[i] == B[j]) {
				if (C.contains(A[i])==false) {
					C.add(A[i]);
				}
				i++;
				j++;
			} else if (A[i] < B[j]) {
				if (C.contains(A[i])==false) {
					C.add(A[i]);
				}
				i++;
			} else if (A[i] > B[j]) {
				if (C.contains(B[j])==false) {
					C.add(B[j]);
				}
				j++;
			}
		}
		while (i < n1) {
			if (C.contains(A[i])==false) {
				C.add(A[i]);
			}
			i++;
		}
		while (j < n2) {
			if (C.contains(B[j])==false) {
				C.add(B[j]);
			}
			j++;
		}
		
		printMedian(C);

	}

	private static void printMedian(ArrayList<Integer> c) {

		if(c.size()%2==1) {
			System.out.println("Median : " + c.get(c.size()/2));
		}else {
			double n1=c.get(c.size()/2);
			double n2=c.get((c.size()/2)-1);
			double median=(n1+n2)/2;
			System.out.println("Median : " + median);
		}

}	
}