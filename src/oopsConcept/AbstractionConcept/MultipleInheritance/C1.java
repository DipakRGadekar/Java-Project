package oopsConcept.AbstractionConcept.MultipleInheritance;

public class C1 extends C2 implements I1,I2{

	@Override
	public void m2() {
		System.out.println("Im in I2 interface: " + y);		
	}

	@Override
	public void m1() {
		System.out.println("Im in I1 interface: " + x);	
	}

	public static void main(String[] args) {
		C1 c = new C1();
		c.m1();
		c.m2();
		c.m3();
	}
}
