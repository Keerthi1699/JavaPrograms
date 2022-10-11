package Railway;

public class TicketBook {

	    //TICKET AVAIABLITY: --> UNCHANGED 
		final static int upperBerth=2;
		final static int middleBerth=2;
		final static int lowerBerth=2;
		final static int rAC=2;
		final static int wL=3;
		//TICKET COUNT
		static int uBCount=2; //2
		static int mBCount=2;//2
		static int lBCount=2;//2
		static int rACCount=2;//2
		static int wLCount=3; //2

		static int availableTicketCount=8;   //---> Total Count
		
		//ARRAY OF OBJECTS:
		static Pass bookedTicket[]=new Pass[upperBerth+middleBerth+lowerBerth];
		static Pass bookedRAC[]=new Pass[rAC];
		static Pass bookedWL[]=new Pass[wL];
		//TOTAL ARRAY COUNT:  --> n
		static int bookedTicketLength=bookedTicket.length; // ---> n 6
		static int bookedRACLength=bookedRAC.length; // -->  n 2
		static int bookedWLLength=bookedWL.length;  //-->   n  3
		
		//ARRAY COUNT:  -----> like TOP value:
		static int topTicketCount=0;
		static int topRAC=0;
		static int topWL=0;
		//Unique NUMBER GENERATE:
		static int UNoNumber=1;
		
		public void bookTickets(char bP, Pass p) {
			System.out.print("Checking bookticket ---- ");
			if(p.age<=6) {
				System.out.println("hello");
				return;
			}
			if((uBCount>0 && (bP == 'U' || bP=='u')) || (mBCount>0 && (bP == 'M' || bP=='m')) || (lBCount>0 && (bP == 'L' || bP=='l'))) {
				if(uBCount>0 && (bP == 'U' || bP=='u')) {
					System.out.println("  Upper Given  \n");
					//Add Object:
					p.seatNumber=topTicketCount+1+ "U";  //-->Seat Number
					bookedTicket[topTicketCount++]=p;
					//-- one 
					uBCount--;
					availableTicketCount--;
				}else if(mBCount>0 && (bP == 'M' || bP=='m')) {
					System.out.println("   Middle Given  \n");
					//Add Object:
					p.seatNumber=topTicketCount+1 + "M";  //-->Seat Number
					bookedTicket[topTicketCount++]=p;
					//-- one 
					mBCount--;
					availableTicketCount--;
				}else if(lBCount>0 && (bP == 'L' || bP=='l')) {
					System.out.println("   Lower Given  \n");
					//Add Object:
					p.seatNumber=topTicketCount+1 + "L";  //-->Seat Number
					bookedTicket[topTicketCount++]=p;
					//-- one 
					lBCount--;
					availableTicketCount--;
				}
			}else if(uBCount>0) { 
				System.out.println("   Upper Given  \n");
				//Add Object:
				p.seatNumber=topTicketCount+1 + "U";  //-->Seat Number
				bookedTicket[topTicketCount++]=p;
				//-- one 
				uBCount--;
				availableTicketCount--;
			}else if(mBCount>0) { 
				System.out.println("   Middle Given  \n");
				//Add Object:
				p.seatNumber=topTicketCount+1 + "M";  //-->Seat Number
				bookedTicket[topTicketCount++]=p;
				//-- one 
				mBCount--;
				availableTicketCount--;
			}else if(lBCount>0) {
				//Add Object:
				p.seatNumber=topTicketCount+1 + "L";  //-->Seat Number
				bookedTicket[topTicketCount++]=p;
				//-- one 
				lBCount--;
				availableTicketCount--;
				System.out.println("   Lower Given  \n");
			}else if(rACCount>0) { 
				System.out.println("   RAC Given  \n");
				//Add Object:
				p.seatNumber=topRAC+1 + "R";  //-->Seat Number
				bookedRAC[topRAC++]=p;
				//-- one 
				rACCount--;
				availableTicketCount--;
			}else if(wLCount>0) { 
				System.out.println("   Waiting Given  \n");
				//Add Object:
				p.seatNumber=topWL+1 + "WL";  //-->Seat Number
				bookedRAC[topWL++]=p;
				//-- one 
				wLCount--;
			}
		}

		void PrintDetails(int UNo) {
			try{
				for(Pass p : bookedTicket) {
					if(p.UNo == UNo ) {
						p.passDetails();
					}
				}
			}
			catch(Exception e) {
				System.out.println("");
			}
			
		}
		
		void availableTicket() {
			System.out.println("Available Ticket Count : " + availableTicketCount);
			System.out.println("Upper  : "+ uBCount);
			System.out.println("Middle : "+ mBCount);
			System.out.println("Lower  : "+ lBCount);
			System.out.println("RAC    : "+ rACCount);
			System.out.println("Waiting List : "+ wLCount);
		}
}