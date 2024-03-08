package Challenges;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Positive Neagtive Number sort Dashboard");
		System.out.println("Please Enter your number: ");
		double no = input.nextDouble();
		if (no == 0) {
			System.out.println("Enter Number is Zero");
		} else if (no > 0) {
			System.out.println("Enter Number is Positive");
		} else {
			System.out.println("Enter number is negative");
		}
	}
}
