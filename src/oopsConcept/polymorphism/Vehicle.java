package oopsConcept.polymorphism;

public abstract class Vehicle {

	
	private int noOfTires;
	public abstract void start();
	
	Vehicle(){
		this.noOfTires=0;
	}
	Vehicle(int noOfTires){
		this.noOfTires= noOfTires;
	}
	
	public int getNoOfTires() {
		return this.noOfTires;
	}
	}
