package Challenges;

import java.util.Scanner;

public class AbsoluteTernary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Absolute ternary operator");
		System.out.println("Enter your number: ");
		int num = input.nextInt();
		int out = minimumMethod(num);
		System.out.println("Your number is: " + out);
	}

	public static int minimumMethod(int num) {
		int out = num > 0 ? num : -num;
		return out;
	}
}
