package Challenges;

import java.util.Scanner;

public class StudentScoreTernary {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to students score category using ternary operator");
	System.out.println("Enter student score: ");
	int num = input.nextInt();
	String category = minimumMethod(num);
	System.out.println("Your number is: " + category);
	
}

public static String minimumMethod(int num) {
	String out = num > 80 ? "High" : ( num > 50 ? "Moderate" : "Low");
	return out;
}
}

