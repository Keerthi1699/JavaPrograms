package Leveltwothree;

import java.util.Scanner;

public class Palindrome_13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		String s = in.next();
		int index = 1;
		int check = 0;
		
		while(checkPalindrome(s) == false) {
			s = s.charAt(index) + s;
			index += 2;
		}
		
		System.out.println("Longest Palindrome : " + s);

	}
	
	public static boolean checkPalindrome(String s) {
		 
		int n = s.length();
		int flag = 0;
		
		for(int i=0, j=n-1; i<j; i++, j--) {
			if(s.charAt(i) != s.charAt(j)) {
				flag++;
				break;
			}
		}
		if(flag == 0) {
			return true;
		} else {
			return false;
		}
	}

}
