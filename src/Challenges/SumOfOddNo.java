package Challenges;

import java.util.Scanner;

public class SumOfOddNo {
	public static void main(String[] args) {
		System.out.println("We will sum of all number you added");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		int num = sc.nextInt();
		int sum = oddsum(num);
		System.out.println("Oddsum till " + num + " is:" + sum);

	}

	public static int oddsum(int num) {
		int i = 1;
		int sum = 0;
		while (i <= num)
		{
			sum = i + sum;
			i+=2;
		}
		return sum;
	}
}
