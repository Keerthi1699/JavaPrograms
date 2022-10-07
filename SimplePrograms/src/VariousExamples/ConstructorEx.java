package VariousExamples;

public class ConstructorEx {
	
	private String name;
	public ConstructorEx() {
		name = "SuperMan";
		System.out.println("Inside No-Argument Constructor");
	}
	public ConstructorEx(String name) {
		System.out.println("Inside Parameterized Constructor");
		this.name = name;
	}
	public void showName() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		ConstructorEx c1 = new ConstructorEx();
		ConstructorEx c2 = new ConstructorEx("BatMan");
		c1.showName();
		c2.showName();

	}

}