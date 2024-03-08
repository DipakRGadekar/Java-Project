package Challenges;

import java.util.Scanner;

public class FloatMultiplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lets do Float multiplication \n");
		System.out.println("Please enter first decimal number: ");
		double first = input.nextDouble();
		System.out.println("Please enter second decimal number: ");
		double second = input.nextDouble();
		double mul = first * second;
		System.out.println("\n result: "+ mul);
	}
}