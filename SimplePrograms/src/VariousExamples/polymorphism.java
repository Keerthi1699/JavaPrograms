package VariousExamples;

public class polymorphism {
	
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public float add(float n1, float n2) {
		return n1+n2;
	}
	public double add(double n1, double n2) {
		return n1+n2;
	}
	public long add(long n1, long n2) {
		return n1+n2;
	}

	public static void main(String[] args) {
		polymorphism poly = new polymorphism();
		System.out.println(poly.add(1, 4));
		System.out.println(poly.add(1.1111,2.2222));
		System.out.println(poly.add(1.11, 2.22));
		System.out.println(poly.add(1111L, 2222L));

	}

}
