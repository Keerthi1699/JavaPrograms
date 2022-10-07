package Mprogram;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();

        System.out.print("No of Vowels in string: " + vowel(s));
    }
	
 public static int vowel(String s)
    {
        int c = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                c++;
            }
        }
        return c;
    }
}
