package Leveltwothree;

import java.util.Arrays;
import java.util.Scanner;

public class UnionTwoArray_4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter N1 : ");
		int n1=in.nextInt();
		System.out.println("Enter N2 : ");
		int n2=in.nextInt();
		int A[] = new int[n1];
		int B[] = new int[n2];
		//int C[] = new int[n1+n2];
		
		System.out.println("Enter N1 Elements : ");
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n1;i++) {
			A[i]=in.nextInt();
			if(max<A[i]) {
				max=A[i];
			}
			if(min>A[i]) {
				min=A[i];
			}
		}
		System.out.println("Enter N2 Elements : ");
		for(int i=0;i<n2;i++) {
			B[i]=in.nextInt();
			if(max<B[i]) {
				max=B[i];
			}
			if(min>B[i]) {
				min=B[i];
			}
		}
		
		//ALGORITHM:
		//1.
		//2. 
		int y=-min;
		int C[] = new int[n1+n2+y+1];
		//3.
		//4. hP
		
		for(int i=0;i<n1;i++) {
			C[A[i]+y]++;
		}
		
		for(int i=0;i<n2;i++) {
			C[B[i]+y]++;
		}
		
		
		//5. 
		
		for(int i=0;i<max+y+1;i++) {
			if(C[i]!=0) {
				System.out.print(i-y + " ");
			}
		}


	}

}
