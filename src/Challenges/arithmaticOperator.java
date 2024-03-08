package Challenges;

import java.util.Scanner;

public class arithmaticOperator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers to perform arithmatic operation");
	System.out.println("Enter first number: ");
	int m = sc.nextInt();
	System.out.println("Enter second number: ");
	int n = sc.nextInt();
	System.out.println("Addition of two number is: "+ (m +n));
	System.out.println("Subtraction of two number is: "+ (m -n));
	System.out.println("Multiplication of two number is: "+ (m *n));
	System.out.println("Division of two number is: "+ (m/n));
	System.out.println("-----------------------");
	arithmatic();
}
public static void arithmatic() {
	Scanner input = new Scanner(System.in);
	System.out.println("Lets perform arithmatic operation");
	System.out.println("Enter first number");
	int o = input.nextInt();
	System.out.println("Enter second number");
	int p = input.nextInt();
	System.out.println("Addition of two number is: " + (o+p));
}
}
