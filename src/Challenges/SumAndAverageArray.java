package Challenges;

import java.util.Scanner;

public class SumAndAverageArray {

	public static void main(String[] args) {
		System.out.println("Welcome to Array sum and Average");
		int[] numArray = ArrayUtility.inputArray();
		long sum = sumMethod(numArray);
		int avg = avgMethod(numArray);
		System.out.println("Sum of the numbers is: " + sum);
		System.out.println("Average of the numbers is: " + avg);
		
		
	}

	public static long sumMethod(int[] numArray) {
		int i = 0;
		long sum = 0;
		while(i< numArray.length) {
			 sum += numArray[i]; 
					i++;
		}
		return sum;
	}

	public static int avgMethod(int[] numArray) {
		long sum = sumMethod(numArray);
		int avg;
		avg = (int) (sum /numArray.length);
		return avg;
	}
}
