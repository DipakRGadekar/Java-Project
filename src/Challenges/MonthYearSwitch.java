package Challenges;

import java.util.Scanner;

public class MonthYearSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Month of year program using switch case");
		System.out.println("Enter the number: ");
		int no = input.nextInt();
		monthMethod(no);
	}

	public static String monthMethod(int no) {
		String abc = switch (no) {
		case 1 -> "January";
		case 2 -> "February";
		case 3 -> "March";
		case 4 -> "April";
		case 5 -> "May";
		case 6 -> "June";
		case 7 -> "July";
		case 8 -> "Augest";
		case 9 -> "September";
		case 10 -> "Octomeber";
		case 11 -> "November";
		case 12 -> "December";
		default -> "Invalid number";
		};
		System.out.println(abc);
		return abc;
	}

}
