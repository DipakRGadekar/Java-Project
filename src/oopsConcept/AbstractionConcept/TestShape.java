package oopsConcept.AbstractionConcept;

public class TestShape {

	public static void main(String[] args) {
		Circle cir = new Circle(15);
		cir.calculateArea();

		Square squ = new Square(10);
		squ.calculateArea();
	}
}
