package basic;

import java.util.Scanner;

public class Alphapangram {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		boolean[] alphlist = new boolean[26];
		int i = 0;
		int flag = 1;
		for(int j = 0;j < str.length();j++) {
			if(str.charAt(j) >= 65 && str.charAt(j) <= 90) {
				i = str.charAt(j) - 65;
			}
			else if(str.charAt(j) >= 97 && str.charAt(j) <= 122) {
				i = str.charAt(j) - 97;
			}
			alphlist[i] = true;
		}
		for(int j = 0;j <= 25;j++) {
			if(alphlist[j] == false)
				flag = 0;
		}
		System.out.println("String: " + str);
		if(flag == 1)
			System.out.println("pangram");
		else
			System.out.println("not pangram");

	}

}
