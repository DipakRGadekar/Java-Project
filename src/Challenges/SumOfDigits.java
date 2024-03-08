package Challenges;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println("Welcome to Sum of digits");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number: ");
		int num = sc.nextInt();
		int sum = SumOfDigitMethod(num);
		System.out.println("Sum of digit is: " + sum);
	}

	public static int SumOfDigitMethod(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}

		return sum;
	}
}
