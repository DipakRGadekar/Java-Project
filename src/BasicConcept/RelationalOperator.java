package BasicConcept;
import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to driving licence site\n");
		System.out.println("Enter Your age");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("Hello, You are eligible for driving licence");
		} else {
			System.out.println("Soory, You are not eligible");
		}
	}
}
