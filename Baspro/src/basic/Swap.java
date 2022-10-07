//swap two variables


package basic;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int e = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int r = scanner.nextInt();
		
		int q = e;
		e = r;
		r = q;
		
		System.out.println("Swapping : " + e + "\n" + r );

	}

}
