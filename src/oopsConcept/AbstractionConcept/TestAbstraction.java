package oopsConcept.AbstractionConcept;

public class TestAbstraction {
	public static void main(String[] args) {
		// Vehicle veh = new Vehicle(4);
		Car car = new Car();
		car.getSetGo();
		car.makeStartSound();
		car.commute();
		
	}
}
