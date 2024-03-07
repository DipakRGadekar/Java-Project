package oopsConcept.AbstractionConcept;

public class Eagle extends Birds {

	public Eagle(String breed) {
		super(breed);

	}

	@Override
	public void fly() {
		System.out.println("Eagle can fly");
	}

	@Override
	void wings() {
		System.out.println("Eagle have 2 wings");
	}

}
