package geometry;

public class Calculator {

	public static void main(String[] args) {
		Circle cir = new Circle(5);
		Rectangle rect = new Rectangle(10, 350);
		double Circlearea = Math.PI * Math.pow(cir.radius, 2);
		System.out.println("Area of circle is: " + Circlearea);
		int RectangleArea = rect.length * rect.width;
		System.out.println("Area of rectangle is: " + RectangleArea);
System.out.printf("Area of circle is %s, Area of Rectangle is %s",Circlearea,RectangleArea);
	}

}
