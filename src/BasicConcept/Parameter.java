package BasicConcept;

public class Parameter {
	public static void main(String[] args) {
		int result = sumTwoNumbers(45, 55);
		System.out.println("Addition of two number is: " + result );
	}

	public static int sumTwoNumbers(int first, int second) {
		int sum = first + second;
		return sum;
	}
}
