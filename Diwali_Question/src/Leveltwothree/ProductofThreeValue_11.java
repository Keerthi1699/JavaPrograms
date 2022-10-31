package Leveltwothree;

import java.util.Scanner;

public class ProductofThreeValue_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// INPUT::
		System.out.println("Enter N Value: ");
		int n = in.nextInt();
		int A[] = new int[n];
		System.out.println("Enter Elements : ");

		for (int i=0; i<n; i++) {
			A[i] = in.nextInt();
		}
		
		int result=findProductOfThreeNumber(A,n);
		System.out.println("Ability Level : " + result);

	}
	
	private static int findProductOfThreeNumber(int[] A, int n) {
		int flag = 0;
		int x,y,z;
		int product;
		int maxProduct = A[0] * A[1] * A[2];
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					product = A[i] * A[j] * A[k];
					if(maxProduct < product) {
						maxProduct = product;
					}
				}
			}
		}
		return maxProduct;
	}

}