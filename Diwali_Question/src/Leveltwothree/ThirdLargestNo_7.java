package Leveltwothree;

import java.util.Scanner;

public class ThirdLargestNo_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//INPUT:
		System.out.println("Enter N Value: ");
		
		int n = in.nextInt();
		int A[] = new int[n];
		System.out.println("Enter Elements : ");
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			A[i]=in.nextInt();
			if(min>A[i]) {
				min=A[i];
			}
		}
		
		int k=3;
		//Min-1 is for a common value
		findKLargest(A,n,k,min-1);
	}
	
private static void findKLargest(int[] A, int n, int k, int cv) {
		
		int max;
		int max2 = 0;
		int index = 0;
		
		while(k>0) {
			max = 0;
			for(int i=0; i<n; i++) {
				if(max<A[i]) {
					max=A[i];
					index=i;
				}
			}
			max2=max;
			A[index]=cv;
			k--;
			
		}
		
		System.out.println("Third Largest Value is : " + max2);
		
	}

}
