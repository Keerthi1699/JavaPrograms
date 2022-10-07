package basicstrpattern;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String s = scanner.nextLine();
		char[]A = s.toCharArray();
		int n = A.length;
		int flag = 0;
		
		for(int i=0,j=n-1; i<j; i++,j--) {
			while(!(A[i]>='a' && A[i]<='z' || A[i]>='A' && A[i]<='Z')){
				i++;
			}
			while(!(A[j]>='a' && A[j]<='z' || A[j]>='A' && A[j]<='Z')) {
				j--;
			}
			if(i<j) {
				if(A[i]!=A[j]) {
					flag++;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("It's a Palindrome");
		}
		else {
			System.out.println("It's not a Palindrome");
		}

	}

}