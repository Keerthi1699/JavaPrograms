package Railway;

public class Pass {
	
	String name;
	int age;
	char gender;
	char bP;
	int UNo;
	String seatNumber;
	
	public Pass(String name,int age,char gender,int UNo) {
		
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.UNo=UNo;
		seatNumber="  ";
	
	}
	
	void passDetails() {
	
		System.out.println("-- * - * - * --");
		System.out.println("\nName  : " + name);
		System.out.println("Age     : " + age);
		System.out.println("gender  : " + gender);
		System.out.println("SeatNo. : " + seatNumber);
		System.out.println("Unique N0  : " + UNo + "\n");
		
	}
}
