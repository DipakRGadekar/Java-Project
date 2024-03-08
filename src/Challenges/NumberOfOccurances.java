package Challenges;

import java.util.Scanner;

public class NumberOfOccurances {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Number of occurances");
		int[] numArray = ArrayUtility.inputArray();
		System.out.println("Enter the number you want to find: ");
		int num = input.nextInt();
		int count = numOccurnceMethod(numArray, num);
		System.out.println("Your number present in series: " + count + " times");
	}

	public static int numOccurnceMethod(int[] numArray, int num) {
		int occ = 0;
		int i = 0;
		while (i < numArray.length) {
			if (num == numArray[i]) {
				occ++;
			}
			i++;
		}
		return occ;

	}

}
