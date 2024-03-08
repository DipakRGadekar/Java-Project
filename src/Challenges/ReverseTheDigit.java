package Challenges;

import java.util.Scanner;

public class ReverseTheDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to reverse the number");
	System.out.println("Enter you number: ");
	 int num = sc.nextInt();
		int reverse = ReverseTheDigit( num);
		System.out.println("Reverse no is: " + reverse);
}
public static int ReverseTheDigit(int num) {
	int newNo =0;
	while(num>0) {
		int digit = num %10;
		newNo = newNo *10 + digit;
		num/=10;
	}
	return newNo;
}
}
