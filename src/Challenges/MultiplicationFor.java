package Challenges;

import java.util.Scanner;

public class MultiplicationFor {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome Multiplication Table");
	System.out.println("Enter the number which you want multiplication: ");
	int num = input.nextInt();
	multiMethod(num); 
}
	public static int multiMethod(int num) 
	{

		for (int i=1; i<=10 ;i++) {
			System.out.println(num + " * " + i + " = " + num*i  );
		}
		return num;
	}
}

