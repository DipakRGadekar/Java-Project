package Challenges;

public class PalindromeArray {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 4, 3, 2, 1 }; // Palindrome array
		int[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // Non-palindrome array

		System.out.println("Array 1 is a palindrome: " + isPalindrome(array1));
		System.out.println("Array 2 is a palindrome: " + isPalindrome(array2));
	}

	public static boolean isPalindrome(int[] array) {
		int start = 0;
		int end = array.length -1;
		while (start < end) {
			if (array[start] != array[end]) {
				return false; // If elements at start and end indices are not equal, it's not a palindrome
			}
			start++;
			end--;
		}
		return true; // If loop completes without returning false, it's a palindrome
	}
}
