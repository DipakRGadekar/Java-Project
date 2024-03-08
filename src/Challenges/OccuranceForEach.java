package Challenges;

import java.util.Scanner;

public class OccuranceForEach {

	public static void main(String[] args) {
		System.out.println("Welcome to max integer of Array");
		int[] arr = ArrayUtility.inputArray();
		System.out.println("Enter the number which you want to count: ");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		int occ = occuranceMethod(arr, element);
		System.out.println("Your number occure " + occ + " times");
	}

	public static int occuranceMethod(int[] arr, int element) {
		int occ = 0;
		for (int num : arr) {
			if (num == element) {
				occ++;
			}
		}
		return occ;

	}
}
