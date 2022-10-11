package Railway;

import java.util.*;

public class BookRail {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("TRAIN TICKET BOOKING\n");
		
		
		
		/*VARIABLE DECLERARATION:   */
		TicketBook ticketBooking=new TicketBook(); 
		int e;
		int UNo;
	
		
		do {
			System.out.println("\n-----------------------------------------");
			System.out.println("1. Book Ticket\n2. Cancel Ticket\n3. Print Ticket\n4. Available Ticket\n5. Exit ");
			System.out.println("-----------------------------------------\n");
			System.out.print("\n Enter Your Option  :  ");
			e=in.nextInt();
			switch(e) {
			case 1:
				System.out.println("\n \n Ticket booking");
				ticketBook(ticketBooking);
				break;
			case 2:
				System.out.println("Cancel booking...");
				break;
			case 3:
				System.out.println("Print Ticket...");
				System.out.print("Enter Your Unique Number : ");
				UNo=in.nextInt();
				ticketBooking.PrintDetails(UNo);
				break;
			case 4:
				System.out.println("Available Ticket...");
				ticketBooking.availableTicket();
				break;
			case 5:
				System.out.println("Thank You!!!!");
				break;
				
				default:
					System.out.println("Wrong Option!!!");
					break;
			}
		}while(e!=5);
	}

	private static void ticketBook(TicketBook ticketBooking) {
		Scanner in=new Scanner(System.in);
		Pass passenger;
		//Variables:
		int bookCount; //HOW MANY TICKET YOU WANT TO BOOK:
		String name;
		char berthPerference; 
		int age; 
		char gender;
		int UNo;

		System.out.print("Enter How Many TIckets : ");
		bookCount=in.nextInt();
		
		if(TicketBook.availableTicketCount>=bookCount) {
			UNo=TicketBook.UNoNumber;
			while(bookCount>0) {
				System.out.print("Enter Name : ");
				name=in.next();
				System.out.print("Enter berthPerference(U,M,L) : ");
				berthPerference=in.next().charAt(0);
				System.out.print("Enter Age : ");
				age=in.nextInt();
				System.out.print("Enter gender (M/F) : ");
				gender=in.next().charAt(0);
				
				passenger=new Pass(name,age,gender,UNo);
				ticketBooking.bookTickets(berthPerference,passenger);
				bookCount--;
			
			}
			System.out.println("Your Unique NUMBER : " + TicketBook.UNoNumber);
			TicketBook.UNoNumber++;
			
		}else {
			System.out.println(bookCount + " number of ticket Not Available!!!");
		}
}
}
