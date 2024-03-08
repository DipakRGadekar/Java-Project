package Challenges;

public class MaxMinArray {

	public static void main(String[] args) {
		System.out.println("Welcome to Max and Min");
		int[] numArray = ArrayUtility.inputArray();
		int max = max(numArray);
		int min = min(numArray);
		System.out.println("Max number is: " + max);
		System.out.println("Min number is: " + min);
	}

	public static int max(int[] numArray) {
		if (numArray.length == 0) {
			return Integer.MIN_VALUE;
		}
		int i = 1;
		int max = numArray[0];
		while (i < numArray.length) {
			if (max < numArray[i]) {
				max = numArray[i];
			}
			i++;
		}
		return max;
	}

	public static int min(int[] numArray) {
		int min = Integer.MAX_VALUE;
		int i = 0;
		while(i< numArray.length) {
		if(	min > numArray[i]) {
			min = numArray[i];
		}
		i++;
		}
		return min;
	}
}
