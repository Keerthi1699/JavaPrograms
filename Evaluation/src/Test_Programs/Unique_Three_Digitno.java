//4. Create and Display unique three-digit no using 1,2,3,4. also count how many three-digit no are there.


package Test_Programs;

public class Unique_Three_Digitno {

	public static void main(String[] args) {
		int c = 0;
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				for(int k=1; k<=4; k++) {
					if(k!=i && k!=j && i!=j) {
						System.out.println(i + " " + j + " " + k + " ");
					}
				}
			}
		}
		System.out.println("Total number of the three-digit number is "+c);
		
		

	}

}
