package Railway;

public class Pass {
	
	String name;
	int age;
	char gender;
	char bP;
	int UNo;
	String seatNumber;
	int serialNumber;
	static int SERIALNUMBER=1;
	
	public Pass(String name,int age,char gender,int UNo) {
		
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.UNo=UNo;
		seatNumber="  ";
		serialNumber=SERIALNUMBER++;
	
	}
	
	void passDetails() {
	
		System.out.print(name + "\t\t");
		System.out.print(age + "\t");
		System.out.print(gender + "\t   ");
		System.out.print(UNo + "\t   ");
		System.out.print(bP + "\t   ");
		System.out.print(serialNumber + "\t\n");
		//System.out.println("SeatNo. : " + seatNumber);

	}
	
	public void setDetails(Pass p1) {
		this.name = p1.name;
		this.age = p1.age;
		this.gender = p1.gender;
		this.UNo = p1.UNo;
		this.seatNumber = p1.seatNumber;
	}
}
