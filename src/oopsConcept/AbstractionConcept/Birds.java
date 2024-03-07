package oopsConcept.AbstractionConcept;

public abstract class Birds implements Flyable {
	private String breed;

public Birds(String breed) {
	this.breed= breed;
}

	public String getBreed() {
	return breed;
}

public void setBreed(String breed) {
	this.breed = breed;
}

	abstract void wings();
}
