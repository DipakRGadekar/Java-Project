package Challenges;

import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to calculator");
	System.out.println("Enter first number to Add: " );
	int num1= input.nextInt();
	System.out.println("Enter second number to Add: ");
	int num2 = input.nextInt();
	int addition = num1 + num2;
	System.out.println("Addition of Two number is: " + addition);
}
}
