package VariousExamples;

class Mobile{
	String type = "TouchScreen";
	String company = "iPhone";
	
	void showDetails() {
		System.out.println("Company: "+company);
		System.out.println("Type: "+type);
	}
}
public class inheritance extends Mobile {
	double size = 5.80;
	String ram = "4 GB";
	void showMobileDetails() {
		showDetails();
		System.out.println("Mobile Size: "+size);
		System.out.println("Ram Size: "+ram);
	}

	public static void main(String[] args) {
		inheritance inherit = new inheritance();
		inherit.showMobileDetails();
	}

}
