package Challenges;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		
	System.out.println("Welcome to is prime number ");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an number: ");
	int num = sc.nextInt();
	boolean sum = isPrimeMethod(num);
	if (sum) {
	System.out.println("Your number is prime");}
	else {
		System.out.println("Your number is not prime");
	}
}

public static boolean isPrimeMethod(int num) 
{
	int i = 2;
	while (i<num) {
		if(num % i == 0) {
			return false;
		}
		i++;
	}
	return true;
}
}

