package Challenges;

import java.util.Scanner;

public class GreatestThreeNo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Greatest from Three Number platform");
		System.out.println("Please Enter your first number: ");
		double no1 = input.nextDouble();
		System.out.println("Please Enter your second number: ");
		double no2 = input.nextDouble();
		System.out.println("Please Enter your third number: ");
		double no3 = input.nextDouble();
		
		if (no1 >=no2 && no1>= no3) {
			System.out.println("Enter number: " + no1 + " is greater then remaininng numbers");
		}
		else if (no2>= no1 && no2>= no3)
		{
			System.out.println("Enter number: " + no2 + " is greater then remaininng numbers");
		}
		else {
			System.out.println("Enter number: " + no3 + " is greater then remaininng numbers");
		}
}
}