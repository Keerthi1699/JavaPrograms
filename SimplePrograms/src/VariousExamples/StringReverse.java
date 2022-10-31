package VariousExamples;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = scan.nextLine();
		System.out.println("Reverse String : " +str);
		
		for(int i = str.length(); i>0; i--)
		{
			System.out.println(str.charAt(i-1));
		}

	}

}
