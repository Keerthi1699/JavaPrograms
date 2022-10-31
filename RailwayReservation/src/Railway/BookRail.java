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
		int serialNumber;
	
		
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
				System.out.println("Enter Sno to cancel: ");
				serialNumber=in.nextInt();
				ticketCancel(ticketBooking,serialNumber);
				break;
			case 3:
				System.out.println("Print Ticket...");
				System.out.print("Enter Your Unique Number : ");
				UNo=in.nextInt();
				System.out.println("NAME           AGE     GENDER     PNR     BP     S.No");
				ticketBooking.PrintDetails(UNo);
				break;
			case 4:
				System.out.println("Available Ticket...");
				ticketBooking.availableTicket();
				break;
			case 5:
				System.out.println("Thank You!!!!");
				break;
			case 6:
				TicketBook.admin();
				break;
				
				default:
					System.out.println("Wrong Option!!!");
					break;
			}
		}while(e!=5);
	}
	

	private static void ticketCancel(TicketBook ticketBooking,int serialNumber) {

		if(ticketBooking.availableTicketCount==ticketBooking.n) {   
			System.out.println("No Tickets Available to Cancel!!!");
			return;
		}
		else{
			int n1=ticketBooking.topTicketCount;
			for(int i=0;i<n1;i++) {
				Pass p=ticketBooking.bookedTicket[i];

				if(p.serialNumber==serialNumber) {

					for(int j=i;j<n1-1;j++) {
						ticketBooking.bookedTicket[j]=ticketBooking.bookedTicket[j+1];
						
					}
					ticketBooking.topTicketCount--; //minise 1 value
					ticketBooking.availableTicketCount++;
					
					if(p.bP=='U' || p.bP=='u') {
						ticketBooking.uBCount++;
						System.out.println(" *** Call Upper *** ");
						int temp = cancel(ticketBooking, ticketBooking.uBCount,p.bP);
						ticketBooking.uBCount = temp;
						
					}else if(p.bP=='M' || p.bP=='m'){
							ticketBooking.mBCount++;
							System.out.println(" *** Call Middle *** ");
							int temp = cancel(ticketBooking, ticketBooking.mBCount,p.bP);
							ticketBooking.mBCount = temp;
						
					}else if(p.bP=='L' || p.bP=='l') {
							ticketBooking.lBCount++;
							System.out.println(" *** Call Lower *** ");
							int temp = cancel(ticketBooking, ticketBooking.lBCount,p.bP);
							ticketBooking.lBCount = temp;
						}
				}
			}
					
						
								
			//2. ARRAY -->2
			int n2=ticketBooking.topRAC;
			for(int i=0;i<n2;i++) {
				Pass p=ticketBooking.bookedRAC[i]; 
				if(p.serialNumber==serialNumber) {
					for(int j=i;j<n2-1;j++) {
						ticketBooking.bookedRAC[j]=ticketBooking.bookedRAC[j+1];
					}
				
					ticketBooking.rACCount++; //ticket count + 1;
					ticketBooking.availableTicketCount++;
					ticketBooking.topRAC--; //minizse 1 value
				}
			}
			
			//3.  ARRAY -->3
			int n3 = ticketBooking.topWL;
			for(int i=0;i<n3;i++) {
				Pass p=ticketBooking.bookedWL[i]; //temp obj
				if(serialNumber==p.serialNumber) {
					for(int j=i;j<n3-1;j++) {
						ticketBooking.bookedWL[j]=ticketBooking.bookedWL[j+1];
					}
					ticketBooking.wLCount++; //ticket count + 1;
                    ticketBooking.topWL--; //minizse 1 value
					
				}
			}
			System.out.println("Cancel Successfully...");
		}

	}
    private static int cancel(TicketBook ticketBooking, int availableberth, char pb) {
    	if(TicketBook.topRAC!=0) {
			String seatNum = ticketBooking.bookedTicket[ticketBooking.topTicketCount].seatNumber; 
			ticketBooking.bookedTicket[ticketBooking.topTicketCount++] = ticketBooking.bookedRAC[0];
			swapBerthId(seatNum,ticketBooking.topTicketCount-1,pb);
			ticketBooking.availableTicketCount--;
			
			//RAC SWAP
			if(ticketBooking.topRAC==1) {
				ticketBooking.topRAC--;
				//2 conditions
				availableberth--;
				ticketBooking.rACCount++;
				}
			else if(ticketBooking.topRAC>1) {
				for(int j=0;j<ticketBooking.topRAC-1;j++) {
					ticketBooking.bookedRAC[j]=ticketBooking.bookedRAC[j+1];
				}
				ticketBooking.topRAC--;
				availableberth--;
				ticketBooking.rACCount++;
				}			
			//waiting LIst CHeck:
			//same like RAC
			if(TicketBook.topWL!=0) {
				/*Seat Number and Berth CHange */
				seatNum=ticketBooking.bookedRAC[ticketBooking.topRAC].seatNumber;
						
				ticketBooking.bookedRAC[ticketBooking.topRAC++]=ticketBooking.bookedWL[0]; //bookedRAC								
				//SEAT NO AND BERTH PERFERNCE CANGE CODE:
				swapBerthIdWL(seatNum,ticketBooking.topRAC-1,'R'); 

				ticketBooking.availableTicketCount--;
				if(ticketBooking.topWL==1) {
					ticketBooking.topWL--;
					//2 conditions
					ticketBooking.wLCount++;
					ticketBooking.rACCount--; 
					ticketBooking.availableTicketCount++;

				}else if(ticketBooking.topWL>1) {
					for(int j=0;j<ticketBooking.topWL-1;j++) {
						ticketBooking.bookedWL[j]=ticketBooking.bookedWL[j+1];
					}
					ticketBooking.topWL--;  
					ticketBooking.rACCount--; 
					ticketBooking.wLCount++;  
					ticketBooking.availableTicketCount++;

				}
			}
    	}
		return availableberth;
    }

	private static void swapBerthId(String seatNum, int index, char bP) {
		TicketBook.bookedTicket[index].bP=bP;
		TicketBook.bookedTicket[index].seatNumber=seatNum;
	}

	private static void swapBerthIdWL(String seatNum, int index, char bP) {
		TicketBook.bookedRAC[index].bP=bP;
		TicketBook.bookedRAC[index].seatNumber=seatNum;
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
		int noOfTicket = bookCount;
		
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
			printBill(noOfTicket);
			System.out.println("Your Unique NUMBER : " + TicketBook.UNoNumber);
			TicketBook.UNoNumber++;
			
		}else {
			System.out.println(bookCount + " number of ticket Not Available!!!");
		}
}
	
	private static void printBill(int bookCount) {
		
		int ticketPrice=1000;
		
		System.out.println("-----****-----****-----****-----");
		System.out.println("Ticket Price      : " + ticketPrice);
		System.out.println("Number of Tickets : "+ bookCount);
		System.out.println("TOTAL PRICE       : Rs. " + (bookCount*ticketPrice));
	}
}
