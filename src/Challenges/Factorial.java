package Challenges;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	System.out.println("Welcome to factorial calculator");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an number: ");
	int no = sc.nextInt();
	long sum = (factorialMethod(no));
	System.out.println(sum);
	
}
public static long factorialMethod(int no) {
	
	if (no<2) {
		return 1;
	}
	long fact = 1;
	int i =2;
	while (i<=no) 
	{
		fact *= i;
		i++;
		
	}
	return fact;
	
}
}
