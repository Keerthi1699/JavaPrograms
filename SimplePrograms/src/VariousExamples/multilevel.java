package VariousExamples;

class Samsung{
	String company = "Samsung";
}

class SamsungMSeries extends Samsung{
	String type = "TouchScreen";
	boolean GPS = true;
	String charger = "Type-C";
	public void showMSeriesinfo() {
		System.out.println("Company: " +super.company);
		System.out.println("Type: " +type);
		System.out.println("GPS: " +GPS);
		System.out.println("Charger: " +charger);
	}
}
public class multilevel extends SamsungMSeries {
	double size = 6.40;
	int batteryCapacity = 6000;
	
	public void showMobileDetails() {
		showMSeriesinfo();
		System.out.println("Size: " +size);
		System.out.println("Battery: " +batteryCapacity);
	}
	public static void main(String[] args) {
		multilevel lev = new multilevel();
		lev.showMobileDetails();
	}
}