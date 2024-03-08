package Challenges;

import java.util.Scanner;

public class SimpleCalculatorSwitch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Calculator Switch");
		System.out.println("What you want to do: ");
		String sc = input.next();
		System.out.println("Enter your first number: ");
		int no1 = input.nextInt();
		System.out.println("Enter your Second number: ");
		int no2 = input.nextInt();

		calculatorApproach(no1, no2, sc);
	}

	public static int calculatorApproach(int no1, int no2, String sc) {

		int out = switch (sc) {
		case "Addition" -> no1 + no2;
		case "Subtraction" -> no1 - no2;
		case "Multiplication" -> no1 * no2;
		case "Division" -> no1 / no2;
		default -> -1;
		};
		System.out.println(sc + " of two number is: " + out);
		return out;
	}

}
