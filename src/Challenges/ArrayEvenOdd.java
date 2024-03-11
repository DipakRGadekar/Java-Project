package Challenges;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;
		int add = 0;
		System.out.println("Using For each loop");
		for (int i : a) {
			if (i % 2 == 0) {
				System.out.println("Even numbers: " + i);
			} else {
				System.out.println("Odd numbers: " + i);
			}
		}

		System.out.println("---------------------");
		for (int i : a) {
			if (i == 5) {
				System.out.println("Numbers is present: " + i);
			}
		}

	}
}
