package Challenges;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Welcome to Fibonacci Series");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number upto which you need series: ");
		int num = sc.nextInt();		
		System.out.println("Here is you Fibonacci Series: " );
		FibonacciSeriesMethod(num);
	}

	public static void  FibonacciSeriesMethod(int num) {
		if(num < 0 ) return;
		System.out.print("0 ");
		if(num ==0 ) return;
		System.out.print("1 ");
		
		int first = 0, second = 1;
	while(first + second <= num)
	{
		int third = first + second;
		System.out.print(third + " ");
		first = second;
		second = third;
	}
	}
}
