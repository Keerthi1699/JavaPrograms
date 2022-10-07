package Mprogram;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();

        System.out.print("No of Vowels in string: " + word(s));

	}
	 public static int word(String s) {
		 int c=0;
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)==' ') {
				 c++;
			 }
		 }
		 c = c+1;
		 return c;
	 }
}
