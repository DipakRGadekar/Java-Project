package Challenges;

import java.util.Scanner;

public class MinimumNumberTernary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Minimum number using ternary operator");
		System.out.println("Enter your first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter your second number: ");
		int num2 = input.nextInt();
		int out = minimumMethod(num1, num2);
		System.out.println("Your minimum number is:" + out);
	}

	public static int minimumMethod(int num1, int num2) {
		int out = num1 > num2 ? num2 : num1;
		return out;
	}
}
