package BasicConcept;
import java.util.Scanner;

public class Logicaloperator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Delhi Metro ticket counter\n");
		System.out.println("Please type true or false, Are you Female? ");
		boolean gender = input.nextBoolean();
		System.out.println("Please enter your age: ");
		int age = input.nextInt();
		if (age < 5) {
			System.out.println("You will get 75% discount");
		} else if (age >= 60 && !gender) {
			System.out.println("You will get 25% Discount");
		} else if (gender) {
			System.out.println("You will get 50% Discount");
		} else {
			System.out.println("You will not get discount");
		}
	}
}
