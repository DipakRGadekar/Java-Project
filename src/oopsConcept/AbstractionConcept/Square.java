package oopsConcept.AbstractionConcept;

public class Square extends Shape {
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public Square(int side) {
		this.side = side;
	}

	@Override
	public void calculateArea() {
		int SquareArea = side * side;
		System.out.println("Area of square is: " + SquareArea);
	}

}
