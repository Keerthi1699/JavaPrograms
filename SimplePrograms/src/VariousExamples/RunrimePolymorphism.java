package VariousExamples;

class Car{
	private int speed = 60;
	public void moveforward() {
		System.out.println("Car moving at speed: " +speed);
	}
}
public class RunrimePolymorphism extends Car{
	private int speed = 100;
	public void moveforward() {
		System.out.println("Audi moving at speed: " +speed);
	}
	public static void main(String[] args) {
		Car runtimepoly = new RunrimePolymorphism();
		runtimepoly.moveforward();
		Car car = new Car();
		car.moveforward();
		}

}


