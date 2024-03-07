package BasicConcept;
import java.util.Scanner;

public class BitwiseAND {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Showcasing bitwise AND operator\n");
		System.out.print("Please Enter your first number: ");
		int no1 = input.nextInt();
		System.out.print("Please Enter your first number: ");
		int no2 = input.nextInt();
		int result = no1 & no2;
		System.out.println(result);
	}
}