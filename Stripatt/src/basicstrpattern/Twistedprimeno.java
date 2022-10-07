//3. Twisted Prime Number or not

package basicstrpattern;

import java.util.Scanner;

public class Twistedprimeno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
				int n, c1, c2, rev, i, rem;
				c1 = 0;
				c2 = 0;
				rev = 0;
				System.out.println("Enter the number: ");
				
				n = scanner.nextInt();
				
				for(i=1; i<=n; i++) {
					if(n%i==0) {
						c1++;
					}
				}
				
				while(n!=0) {
					rem = n%10;
					rev = rev*10 + rem;
					n = n/10;
				}
				
				for(i=1; i<=rev; i++) {
					if(rev%i==0) {
						c2++;
					}
				}

				if((c1==2) && (c2==2)) {
					System.out.println("Twisted Prime Number");
				}
				else {
					System.out.println("Not Twisted Prime Number");
				}
			}

		}

