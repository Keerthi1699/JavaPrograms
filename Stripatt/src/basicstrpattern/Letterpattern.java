//7. Letter Pattern

package basicstrpattern;

import java.util.Scanner;

public class Letterpattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int divide = s.length()/2;
		int j = 0;
		char[] arr = new char[s.length()];
		
		for(int i = divide; i<s.length(); i++) {
			arr[j] = s.charAt(i);
			j++;
		}
		for(int i=0; i<s.length()/2; i++) {
			arr[j] = s.charAt(i);
			j++;
		}
		pat(arr);
		scanner.close();
	}
private static void pat(char[] arr) {
	int sp = arr.length*2;
	for(int i=0; i<arr.length; i++) {
		for(int k=0; k<sp; k++) {
			System.out.print(" ");
		}
		for(int j=0; j<i+1; j++) {
			System.out.print(arr[j]);
		}
		System.out.println("");
		sp = sp-2;
	}
}
}