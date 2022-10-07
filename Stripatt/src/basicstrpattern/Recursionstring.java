//10. Change the order of string

package basicstrpattern;

import java.util.Scanner;

public class Recursionstring {

	public static void main(String[] args) {
		String str = new String();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		str = scanner.nextLine();
		
		int i,j,k;
		i = str.length()-1;
		
		while(i >= 0) {
			j = i;
			while(str.charAt(j) != ' ' && j>0)
				j--;
			if(j == 0)
				k = 0;
			else
				k = j+1;
			System.out.println(str.substring(k, i+1));
			i = j - 1;
		}

	}

}
