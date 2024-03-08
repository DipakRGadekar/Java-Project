package Loops;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome Recursion");
		System.out.println("Enter the number which you want factorial of it: ");
		int num = input.nextInt();
		long fact = factorial(num);
		System.out.println("Factorial of given number is: " + fact);
	}

	public static long factorial(int num) {
		System.out.println("Functional call for: " + num);
		if (num == 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

}
