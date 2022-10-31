//You are given an n x n 2D matrix representing an image, 
//rotate the image by 90 degrees(clockwise). You have to rotate the image in-place,
//which means you have to modify the input 2D matrix directly.
//DO NOT allocate another 2D matrix and do the rotation.


package Digitnumbersmartrix;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//System.out.println("Enter the n value: ");
		
		int[][] arr = new int[n][n];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		//transpose
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for(int i=0; i<arr.length; i++) {
			int li = 0;                   //left index
			int ri = arr[i].length-1;     //right index
			
			while(li<ri) {
				int temp = arr[i][li];
				arr[i][li] = arr[i][ri];
				arr[i][ri] = temp;
				
				li++;
				ri--;
			}
		}
		display(arr);
	}
	public static void display(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	

}
