package oopsConcept.polymorphism;

public class Car extends Vehicle {

	@Override
	public void start() {
		System.out.println(super.getNoOfTires());
		System.out.println("Car is starting");

	}

}
