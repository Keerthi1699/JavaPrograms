// 5. Print the pattern.

package Test_Programs;

import java.util.Scanner;

public class Pattern_Number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scanner.nextInt();
		System.out.println("Enter pattern: ");
		int k=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k++);
				if(j<i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		k-=1;
		for(int i=1;i<=n;i++) {
			int t=k-(n-i);
			for(int j=n;j>=i;j--) {
				System.out.print(t++);
				k--;
				if(j>i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		scanner.close();
		}

}
