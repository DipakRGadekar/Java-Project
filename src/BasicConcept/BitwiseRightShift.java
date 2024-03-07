package BasicConcept;
import java.util.Scanner;

public class BitwiseRightShift {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Showcasing bitwise Right shift operator\n");
		System.out.print("Please Enter your first number: ");
		int no1 = input.nextInt();
		int result = no1 >>1;
		System.out.println(result);
	}
}
