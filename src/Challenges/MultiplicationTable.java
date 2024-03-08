package Challenges;

import java.util.Scanner;

public class MultiplicationTable 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your number: ");
		int num = input.nextInt();
		printMulti(num);
		
	}

		public static int printMulti(int num) 
		{
			int i = 1;
			while (i <= 10) {
				System.out.println(num + "*" + i + "=" + (num * i));
				i++;
			}
			return num;
		
	}
}
