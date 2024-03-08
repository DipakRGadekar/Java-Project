package oopsConcept.Inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		TwoWheeler pulsar = new TwoWheeler();
		pulsar.commute();
		Vehicle father = new Vehicle();
		father.commute();
	}
}
