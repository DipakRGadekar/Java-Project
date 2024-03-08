package Challenges;

public class CompoundInterest {
	public static void main(String[] args) {
		double p = 41.0;
		double t = 35.0;
		double r = 3.0;
		double compoundInterest = p * Math.pow(1 + r / 100, t);
		System.out.println("Compound interest is: " + compoundInterest);
	}
}
