//to display the n terms of odd natural number and their sum


package basic;

import java.util.Scanner;

public class Oddno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Input terms: ");
		
		int sum = 0;
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
					
			System.out.println(2*i-1);
		    sum+=2*i-1;
		}
		System.out.println("sum of odd " + n + "terms is: " + sum);
		
	}

}
