package Railway;
import java.util.Scanner;
import java.util.Date;

public class Berths {
	
	private static int[] berths = new int[13];

	public static void main(String[] args) {
		System.out.println("***WELCOME TO THE SOUTH CENTRAL RAILWAY RESERVATION SYSTEM!!***");
        System.out.println("HAVE A SAFE JOURNEY!!");
        System.out.println();

        for (int i = 0; i < 12; i++) {
            berths[i] = 0;
            }

        Scanner s = new Scanner(System.in);
        int choice = 1;

        System.out.print("Please select your type of berth:\n1.Upper Berth\n2.Lower Berth\n0.Exit.\n");
        choice = s.nextInt();

       while (choice != 0) {
           int seatno = 0;
           if (choice == 1) {
                seatno = bookUpper();

                if (seatno == -1) {
                     seatno = bookLower();

                    if (seatno != -1) {
                        System.out.println("Sorry, there is no Upper Berths available.");
                        boardPass(seatno);
                        }
                   }
                else {
                    System.out.println("Congratulations, we have a Upper Berth available!");
                    boardPass(seatno);
                    }
                }
            else if (choice == 2) {

                seatno = bookLower();


                if (seatno == -1) {
                    seatno = bookUpper();

                    if (seatno != -1) {
                        System.out.println("Sorry, there are no Lower Berths available. But we do have a Upper Berth.");
                        boardPass(seatno);
                        }
                    }
                else {

                    System.out.println("Congratulations, we have a Lower berth available!");
                    boardPass(seatno);
                    }
                }
            else {

                System.out.println("Your choice is invalid. Please provide valid choice!");
                choice = 0;
                }


            if (seatno == -1) {
                System.out.println("Sorry, there is no Upper Berths or no Lower Berths available");
                System.out.println();
                }



           System.out.print("Please select your type of berth:\n1.Upper Berth\n2.Lower Berth\n0.Exit.\n");
            choice = s.nextInt();
            }


        }

        private static int bookUpper() {
        for (int i = 0; i < 6; i++) {
           if (berths[i] == 0) {
                berths[i] = 1;
                return i + 1;
                }
            }
        return -1;
        }

        private static int bookLower() {
        for (int i = 6; i < 12; i++) {
           if (berths[i] == 0) {
                berths[i] = 1;
                return i + 1;
                }
            }
        return -1;

        }


private static void boardPass(int bn) {
        Date timenow = new Date();
        System.out.println();
        System.out.println("Date: " + timenow.toString());
        System.out.println("Boarding pass for berth number: " + bn);
        System.out.println("Your Booking Successful!!!");
        System.out.println();
       }
	}
