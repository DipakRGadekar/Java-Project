package Challenges;

import java.util.Scanner;

public class EvenOddTernary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Even Odd ternary operator");
		System.out.println("Enter your number: ");
		int num = input.nextInt();
		String out = minimumMethod(num);
		System.out.println("Your number is: " + out);
	}

	public static String minimumMethod(int num) {
		String out = num % 2 == 0 ? "Even" : "ODD";
		return out;
	}
}
