package Challenges;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		System.out.println("Welcome to Sum of digits");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter your second number: ");
		int num2 = sc.nextInt();
		int lcm = LCMMethod(num1, num2);
		System.out.println("Sum of digit is: " + lcm);
	}

	public static int LCMMethod(int num1, int num2) {
		int i = 1;
		while (i <= num2) {
			int fact = num1 * i;
			if (fact % num2 == 0) {
				return fact;
			}
			i++;
		}
		return 0;

	}
}
