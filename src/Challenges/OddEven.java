package Challenges;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to ODD Even number sort Dashboard");
		System.out.println("Please Enter your number: ");
		double no = input.nextDouble();
		if(no%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is ODD");
		}
}}
