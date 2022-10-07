//6. Remove Vowels a,e,i,o,u (lower and upper case) from the string.


package Test_Programs;

import java.util.Scanner;

public class Remove_Vowel {

	public static void main(String[] args) {
		String s1, s2, v;
		char ch;
		int i, c, k;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the word: ");
		
		s1 = scanner.nextLine();
		s2 = " ";
		v = "a, e, i, o, u, A, E, I, O, U";
		
		for(i=0; i<s1.length(); i++) {
			c = 0;
			ch = s1.charAt(i);
			
			for(k=0; k<v.length(); k++) {
				if(ch==v.charAt(k))
					c++;
			}
			if(c==0)
				s2 = s2 + ch;
		}
		System.out.println("Enter the Remaining letter in word :  " +s2);

		

	}

}
