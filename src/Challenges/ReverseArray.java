 package Challenges;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		  int[] array = {10, 25, 9, 48, 75, 4};
		  reverseArray(array);
		  System.out.println(Arrays.toString(array));
	}
	
	public static void reverseArray(int[] array) {
		int start = 0;
		int end = array.length-1;
		
		while(start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
}
