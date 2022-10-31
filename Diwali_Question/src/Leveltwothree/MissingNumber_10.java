package Leveltwothree;

import java.util.Scanner;

public class MissingNumber_10 {

	public static void main(String[] args) {
		
		Scanner inn = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter N1 : ");
		int n1=in.nextInt();
		System.out.println("Enter N2 : ");
		int n2=in.nextInt();
		
		int A[] = new int[n1];
		int B[] = new int[n2];
		
		System.out.println("Enter N1 Elements : ");
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n1;i++) {
			A[i]=in.nextInt();
			if(max<A[i]) {
				max=A[i];
			}
		}
		
		System.out.println("Enter N2 Elements : ");
		for(int i=0;i<n2;i++) {
			B[i]=in.nextInt();
			if(max<B[i]) {
				max=B[i];
			}
		}
		int cv=max+1;
		
		findRetanNumber(A,B,n1,n2,cv);

	}

	private static void findRetanNumber(int[] A, int[] B, int n1, int n2, int cv) {
		
		for(int i=0;i<n2;i++) {
			for(int j=0;j<n1;j++) {
				if(B[i]==A[j]) {
					A[j]=cv;
				}
			}
		}
		
		print(A,n1,cv);
		
	}

	private static void print(int[] A, int n1, int cv) {
		
		for(int i=0;i<n1;i++) {
			if(A[i]!=cv) {
				System.out.print(A[i] + " is the missing number from first array " + "\n");
			}
		}
		
	}

}
