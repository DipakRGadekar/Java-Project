package Challenges;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Palindrome number");
		System.out.println("Enter you number: ");
		int num = sc.nextInt();
		int reverse = PalindromeMethod(num);
		if (reverse == num) {
			System.out.println("Your number is Palindrome Number");
		}
		else {
			System.out.println("Your number is Not Palindrome Number");
		}
	}

	public static int PalindromeMethod(int num) {
		int newNo = 0;
		while (num > 0) {
			int digit = num % 10;
			newNo = newNo * 10 + digit;
			num /= 10;
		}
		return newNo;
	}
}
