package Leveltwothree;

import java.util.Scanner;
import java.util.Stack;

public class ArrayStack_14 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// INPUT:
		System.out.println("ENter n Value: ");
		int n = in.nextInt();
		int A[] = new int[n];
		System.out.println("Enter Elements : ");
		
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		
		pushStack(A,n);

	}

	private static void pushStack(int[] A, int n) {
		
		Stack s=new Stack();
		int min=A[0];
		
		for(int i=0;i<n;i++) {
			min=Math.min(min, A[i]);
			s.push(min);
		}
		
		popAndPrint(s);
			
	}

	private static void popAndPrint(Stack s) {
		
		while(s.isEmpty()==false) {
			System.out.print(s.pop() + " ");
		}
		
	}

}
