// (L1) takes a number as input and prints its multiplication table up to 10


package basic;

import java.util.Scanner;

public class Multitable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input Number: ");
		
		int n = scanner.nextInt();
		for(int i=1;i<=10;i++) {
		
		System.out.println(n + "*" + i + "=" + (n*i));
		}
	}

}
