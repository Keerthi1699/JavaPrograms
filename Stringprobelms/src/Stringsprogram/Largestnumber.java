// 4. largest number

package Stringsprogram;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the digits: ");
		int st = s.nextInt();
		System.out.println("Enter digits:");
		String[] num = new String[st];
		
		for(int i=0; i<st; i++) {
			int n = s.nextInt();
			num[i] = Integer.toString(n);
		}
		Largestnumber obj = new Largestnumber();
		System.out.println(obj.arrange(num,st));
		s.close();
	}
	String arrange(String arr[], int st) {
		String temp;
		String n = "";
		
		for(int i=0; i<st; i++) {
			for(int j=i+1; j<st; j++) {
				String ij = arr[i] + arr[j];
				String ji = arr[j] + arr[i];
		if(Integer.parseInt(ij) < Integer.parseInt(ji)) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
			}
			n += arr[i];
		}
		return n;
	}	
}
