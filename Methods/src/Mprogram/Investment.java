package Mprogram;

import java.util.Scanner;

public class Investment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		float i = scanner.nextFloat();
		float t = scanner.nextFloat();
		
		interest(a,i,t);
		scanner.close();
	}
	private static void interest(float a, float i, float t) {
		System.out.println(" ");
		for(int j=1; j<=t; j++) {
			float value = interestvalue(a,i,j);
			System.out.println(j+ " " +value);
		}
	}
	private static float interestvalue(float a, float i, float j) {
		float res, x;
		x = (float) Math.pow((1+(i/1200)),12*i);
		res = a*x;
		return res;
	}

}
