package Railway;

import java.io.*;
import java.util.*;

public class Booking {
	  
	private static int counter=100;
	  
	  List<String> BookingList=new ArrayList<String>();
	  ArrayList<Integer> AgeList=new ArrayList<Integer>();

	  public void reservation(){
	
		  System.out.println("Enter the tickets needed:");
	    
		  Scanner tkts=new Scanner(System.in);
	    
		  int tickets=tkts.nextInt();
	    
		  if(tickets<=counter){
	      
			  System.out.println("Enter the Age");
			  //System.out.println("Name: ");
	          System.out.println("Age: ");
	     
	          Scanner age=new Scanner(System.in);
	          int Age=age.nextInt();
	      
	          if(Age<5){
	              System.out.println("You're under 5 -- Booking cancelled");
	              }
	          else{
	        	  for(int i=0;i<tickets;i++){
	        		  System.out.println("Name:");
	          
	        		  Scanner s=new Scanner(System.in);
	           		  String name=s.nextLine();
	          
	           		  BookingList.add(name);
	                  AgeList.add(Age);
	                  counter--;
	                  }
	        	  }
	          }
		  else{
			  System.out.println(tickets+"tickets  unavailable");
			  }
		  System.out.println("Names: "+BookingList+","+"Age:"+AgeList);
		  }

	  public static void main(String[] args) {
	    Booking t1=new Booking();
	    t1.reservation();
	  }
	}


/*
  
 class TestRailwayExceptions{
 public static void main(String arg[]{
 try{
 String travel_date = "10/10/2022";
 TicketBooker ticketBooker = new TricketBooker();
 ticketBooker.bookTicket(17023, travel_date, 3, 1);
 System.out.println("tickets booked"); 
 } catch(RailwayException re){
 System.out.println("Railway booking failed. " + re.getErrorMessage();
 }
 }
 }
class RailwayException extends Exception{
int trainNo;
String errorMessage;
RailwayException(int trainNo, String errorMessage){
this.trainNo = trainNo;
this.errorMessage = errorMessage;
}
String getErrorMessage(){
return errorMessage;
}
}
class ServiceCancelledException extends RailwayException{
String date;
ServiceCancelledException(int trainN0, String date){
super(trainNo, "The service of train " + trainNo + "is cancelled on " + date);
this.date = date;
}
}
class SeatsNotAvailableException extends RailwayException{
String date;
SeatsNotAvailableException(int trainNO, String date){
super(trainNo, " There are no seats available for the train " + trainNo + " on " + date);
this.date = date;
}
}
class TicketBooker
{
public void bookTicket(int trainNo, String date, int adults, int children)
throws RailwayException
{
if(isServiceCancelled(trainNo, date))
{
throw new ServiceCancelledException(trainNo, date);
}
if(areSearsAvailable(trainNo, date, adults, children))
{
confirmBooking(trainNo, date, adults, children);
}
else
{
throw new SeatsNotAvailableException(trainNo, date);
}
}
private boolean isServiceCancelled(int trainNo, String date)
{
return false;
}
private boolean areSeatsAvailable(int trainNo, String date, int adults, int children)
{
return false;
}
private void confirmBooking(int trainNo, String date, int adults, int children)
{
}
}
*/