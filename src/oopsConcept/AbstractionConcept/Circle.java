package oopsConcept.AbstractionConcept;

public class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		double circleArea = Math.PI * Math.pow(radius, 2);
		System.out.println("Area Of circle is: " + circleArea);
	}
}
