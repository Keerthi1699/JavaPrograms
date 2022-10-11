package VariousExamples;

public class Aggregation {

	private String name;
	private int age;
	private Address address;
	
	public Aggregation(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void employeeInfo() {
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("Address: " +address.streetName);
		System.out.println("Pincode: " +address.pincode);
	}
	
	public static void main(String[] args) {
		Aggregation employee = new Aggregation("Ravi", 32, new Address("LIG Street", 465));
		employee.employeeInfo();
	}
	}
class Address{
	String streetName;
	int pincode;
	
	public Address(String streetName, int pincode){
		this.streetName = streetName;
		this.pincode = pincode;
		}
}