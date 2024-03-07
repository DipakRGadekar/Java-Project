package BasicConcept;

public class UnaryOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = -x;
		System.out.println(y);

		x++;
		System.out.println("Increment " + x);
		--x;
		System.out.println("Decrement : " + x);
		
		int z = 20;
		System.out.println(++z);
		System.out.println(z++);
	}

}
