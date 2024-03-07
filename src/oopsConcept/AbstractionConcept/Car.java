package oopsConcept.AbstractionConcept;

public class Car extends Vehicle{

	private int noOfDoors;
	
	public Car() {
		super(4);
	}

	@Override
	public void makeStartSound() {
		System.out.println("vroommm...");
		
	}

	@Override
	public void getSetGo() {
		System.out.println("Chalo niklte he");
		
	}

}
