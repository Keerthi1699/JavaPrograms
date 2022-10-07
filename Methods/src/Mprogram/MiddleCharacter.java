package Mprogram;

import java.util.Scanner;

public class MiddleCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s = scanner.nextLine();
		System.out.print("Middle Character in string: " +middle(s));
	}
	public static String middle(String s) {
		int x;
		int y;
		if(s.length()%2==0) {
			x = s.length()/2-1;
			y=2;
			}
		else {
			x = s.length()/2;
			y=1;
			}
		return s.substring(x,x+y);
		}
	}
