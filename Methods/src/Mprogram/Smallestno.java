package Mprogram;

import java.util.Scanner;

public class Smallestno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int x = scanner.nextInt();
		System.out.print("Enter Second Number: ");
		int y = scanner.nextInt();
		System.out.print("Enter Third Number: ");
		int z = scanner.nextInt();
		small(x,y,z);
	}
	static void small(int x,int y,int z) {		
		
		if(x<=y && x<=z) {
			System.out.println("The Smallest Number is " + x);
		}
		else if(y<=x && y<=z) {
			System.out.println("The Smallest Number is " + y);
		}
		else {
			System.out.println("The Smallest Number is " + z);
		}
	}
}