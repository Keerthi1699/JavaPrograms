package basic;

import java.util.Scanner;

public class FloatpointPosNeg {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		double n = scanner.nextDouble();
		
		
		System.out.println((n>0)?(n<1)?"Positive Small":(n>1000000)?"Positive Large":"Positive":
			(n<0)?(n<1)?"Negative Small":(n>1000000)?"Negative Large":"Negative":"Zero");
		
	}

}
