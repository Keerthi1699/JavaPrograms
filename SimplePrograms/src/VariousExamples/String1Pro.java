package VariousExamples;

import java.util.Scanner;

public class String1Pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//String n = scan.next();
		System.out.println("Enter String: ");
		String str = scan.nextLine();
		int len = str.length();
				
		for(int i=0; i<str.length(); i++) {
			System.out.println(len);
		}
		

	}

}
