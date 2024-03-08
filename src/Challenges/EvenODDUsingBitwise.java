package Challenges;

import java.util.Scanner;

public class EvenODDUsingBitwise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Even Odd using bitwise operator\n");
		System.out.print("Please Enter your number: ");
		int no1 = input.nextInt();
		if((no1 & 1)==1){
			System.out.println("Number is ODD");
		}else {
			 System.out.println("Number is even");
		}
	}

}
