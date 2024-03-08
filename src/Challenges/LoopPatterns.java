package Challenges;

import java.util.Scanner;

public class LoopPatterns {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("We are here to print patterns\n");
	System.out.println("Please enter the no of rows: ");
	int rows = input.nextInt();
	RightHalfPyramid(rows);
}
public static void RightHalfPyramid(int maxRows) {
	System.out.println("Right Half Pyramid");
	/*
	 *
	 * *
	 * * *
	 * * * *
	 * * * * *
	 */
	int row = 0;
	while (row < maxRows) {
		System.out.print("*");
		int colu = 0;
		while (colu < row) {
			System.out.print(" *");
			colu++;
		}
		row++;
		System.out.println();
	}
}
}
