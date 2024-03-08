package oopsConcept.polymorphism;

public class MethodOverloading {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public String sum(String a, String b) {
		return a + b;

	}

	public static void main(String[] args) {
		MethodOverloading overload = new MethodOverloading();
		System.out.println(overload.sum(10, 30));
		System.out.println(overload.sum(25, 01, 70, 66));
		System.out.println(overload.sum("c", "d"));
	}
}
