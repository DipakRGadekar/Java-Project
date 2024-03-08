package Challenges;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to identify leap year platform");
		System.out.println("Please Enter your year: ");
		int year = input.nextInt();
		if ((year%4==0 && year %100 !=0)||(year%400==0)) {
			System.out.println("Enter year is leap year");
		}else{
			System.out.println("Enter year is not leap year");
		}
}
}
