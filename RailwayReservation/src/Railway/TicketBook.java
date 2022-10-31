package Railway;

public class TicketBook {

	    //TICKET AVAIABLITY: --> UNCHANGED 
		final static int upperBerth=1;
		final static int middleBerth=1;
		final static int lowerBerth=1;
		final static int rAC=1;
		final static int wL=1;
		
		//TICKET COUNT
		static int uBCount=2; //2
		static int mBCount=2;//2
		static int lBCount=2;//2
		static int rACCount=2;//2
		static int wLCount=2; //2
        static final int n=(upperBerth+middleBerth+lowerBerth+rAC+wL);
		static int availableTicketCount=(upperBerth+middleBerth+lowerBerth+rAC+wL);   //---> Total Count
		
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
//			System.out.print("Checking bookticket ---- ");
			if(p.age<=6) {
				System.out.println("Age 6 Perso");
				p.seatNumber="-";
				bookedTicket[topTicketCount++]=p;
				p.bP='-';    //checking
				//-- one 
				//lBCount--;
				availableTicketCount--;
				
				return;
			}			
			
			if(p.age > 60 && TicketBook.lBCount > 0) {
				System.out.println("<<<<<<Age :60 Lower Given!!!>>>>>");
				p.seatNumber=topTicketCount+1 + "L";  //-->Seat Number
				bookedTicket[topTicketCount++]=p;
				p.bP='L';  // checking
				//-- one 
				lBCount--;
				availableTicketCount--;
			}else if((uBCount>0 && (bP == 'U' || bP=='u')) || (mBCount>0 && (bP == 'M' || bP=='m')) || (lBCount>0 && (bP == 'L' || bP=='l'))) {
				if(uBCount>0 && (bP == 'U' || bP=='u')) {
					System.out.println("  Upper Given  \n");
					//Add Object:
					p.seatNumber=topTicketCount+1+ "U";  //-->Seat Number
					bookedTicket[topTicketCount++]=p;
					p.bP='U';  //checking
					//-- one 
					uBCount--;
					availableTicketCount--;
				}else if(mBCount>0 && (bP == 'M' || bP=='m')) {
					System.out.println("   Middle Given  \n");
					//Add Object:
					p.seatNumber=topTicketCount+1 + "M";  //-->Seat Number
					bookedTicket[topTicketCount++]=p;
					p.bP='M';  //checking
					//-- one 
					mBCount--;
					availableTicketCount--;
				}else if(lBCount>0 && (bP == 'L' || bP=='l')) {
					System.out.println("   Lower Given  \n");
					//Add Object:
					p.seatNumber=topTicketCount+1 + "L";  //-->Seat Number
					bookedTicket[topTicketCount++]=p;
					p.bP='L';  //checking
					//-- one 
					lBCount--;
					availableTicketCount--;
				}
			}else if(uBCount>0) { 
				System.out.println("   Upper Given  \n");
				//Add Object:
				p.seatNumber=topTicketCount+1 + "U";  //-->Seat Number
				bookedTicket[topTicketCount++]=p;
				p.bP='U';  //checking
				//-- one 
				uBCount--;
				availableTicketCount--;
			}else if(mBCount>0) { 
				System.out.println("   Middle Given  \n");
				//Add Object:
				p.seatNumber=topTicketCount+1 + "M";  //-->Seat Number
				bookedTicket[topTicketCount++]=p;
				p.bP='M';   //checking
				//-- one 
				mBCount--;
				availableTicketCount--;
			}else if(lBCount>0) {
				//Add Object:
				p.seatNumber=topTicketCount+1 + "L";  //-->Seat Number
				bookedTicket[topTicketCount++]=p;
				p.bP='L';   //checking
				//-- one 
				lBCount--;
				availableTicketCount--;
				System.out.println("   Lower Given  \n");
			}else if(rACCount>0) { 
				System.out.println("   RAC Given  \n");
				//Add Object:
				p.seatNumber=topRAC+1 + "R";  //-->Seat Number
				bookedRAC[topRAC++]=p;
				p.bP='R';  //checking
				//-- one 
				rACCount--;
				availableTicketCount--;
			}else if(wLCount>0) { 
				System.out.println("   Waiting Given  \n");
				p.bP='W';   //checking
				//Add Object:
				p.seatNumber=topWL+1 + "WL";  //-->Seat Number
				bookedWL[topWL++]=p;
				//-- one 
				wLCount--;
				availableTicketCount--;
			}
		}

		void PrintDetails(int UNo) {
			if(topTicketCount==0) {
				System.out.println(">>>No Tickets Avaiable!!!<<<");
				return;
			}
			int n1=topTicketCount;
			for(int i=0;i<n1;i++) {
				Pass psg=bookedTicket[i];
				if(psg.UNo==UNo) {
					psg.passDetails();
				}
			}

			/* RAC Details Print */
			
			int n2=topRAC;
			for(int i=0;i<n2;i++) {
				Pass psg=bookedRAC[i];
				if(psg.UNo==UNo) {
					psg.passDetails();
				}
			}
			
			/* Waiting List Print*/
			
			int n3=topWL;
			for(int i=0;i<n3;i++) {
				Pass psg=bookedWL[i];
				if(psg.UNo==UNo) {
					psg.passDetails();
				}
			}
			
		}
		
		static void admin() {
			if(topTicketCount==0) {
				System.out.println(" No Tickets Available!!!");
				return;
			}
			int n1=topTicketCount;
			System.out.println("U-M-L TICKET");
			System.out.println("U_M_L Array Print : ");
			System.out.println("Top Ticket Count : "+ topTicketCount);
			System.out.println("Total Count : "+ (upperBerth+middleBerth+lowerBerth));
			for(int i=0;i<n1;i++) {
				Pass psg=bookedTicket[i];
					psg.passDetails();
			}
			System.out.println("----------------------------------");
			
			/* RAC DETAILS PRINT */
			
			System.out.println("** RAC ARRAY **");
			System.out.println("RAC Array Print : ");
			System.out.println("TOP RAC Ticket Count : "+ topRAC);
			System.out.println("Total Count : "+ rAC);
			int n2=topRAC;
			for(int i=0;i<n2;i++) {
				Pass psg=bookedRAC[i];
				psg.passDetails();
			}
			System.out.println("----------------------------------");

			/* WAITING LIST DETAILS PRINT*/
			
			System.out.println(" WAITING LIST ARRAY ");
			System.out.println("WL Array Print : ");
			System.out.println("TOP WL Ticket Count : "+ topWL);
			System.out.println("Total Count : "+ wL);
			int n3=topWL;
			for(int i=0;i<n3;i++) {
				Pass psg=bookedWL[i];
				
					psg.passDetails();
			}
			System.out.println("----------------------------------");
		}
		
		void availableTicket() {
			System.out.println("Available Ticket Count : " + availableTicketCount);
			System.out.println("Upper  : "+ uBCount);
			System.out.println("Middle : "+ mBCount);
			System.out.println("Lower  : "+ lBCount);
			System.out.println("RAC    : "+ rACCount);
			System.out.println("WL     : "+ wLCount);
		}
}