package BasicConcept;
import java.util.Scanner;

public class TernaryOperator {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Welcome to ternary operator");
	System.out.println("Enter your first number: ");
	int num1 = input.nextInt();
	System.out.println("Enter your second number: ");
	int num2 = input.nextInt();
	
	int greaterNumber = num1> num2 ? num1 : num2;
	// condition > true > false
	System.out.println("Your greater number is: " + greaterNumber);
}
}
