package oopsConcept.AbstractionConcept;

public abstract class Vehicle implements InterfaceTest{
	
	private int noOfTires;

	
	public abstract void makeStartSound();
	
	
	public int getNoOfTires() {
		return noOfTires;
	}

	public void setNoOfTires(int noOfTires) {
		this.noOfTires = noOfTires;
	}

	public Vehicle(int noOfTires) {
		this.noOfTires = noOfTires;
	}
	public void commute() {
		System.out.println("going.....");
	}
}
