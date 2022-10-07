package basic;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter x value: ");
		int x = scanner.nextInt();
		
		System.out.println("Enter y value: ");
		int y = scanner.nextInt();
		
		System.out.println("Enter r value: ");
		int r = scanner.nextInt();
				
		while(y!= 0) {
			r = r*x;
			y--;
		}
		
		System.out.println("Output = " + r);

	}

}
