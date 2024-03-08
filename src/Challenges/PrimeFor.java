package Challenges;

import java.util.Scanner;

public class PrimeFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to number is prime or not program");
		System.out.println("Please, Enter your number: ");
		int num = input.nextInt();
		boolean isprime = primeMethod(num);
		System.out.println("Your number is " + (primeMethod(num) ? "Prime" : "Not Prime"));
	}

	public static boolean primeMethod(int num) {
		for(int i=2; i<num; i++) {
		if	(num%i==0) {
			return false;
		} 
		}
		return true;
	}
}