package Challenges;

public class MaximumIntegerForEach {

	public static void main(String[] args) {
		System.out.println("Welcome to max integer of Array");
		int[] arr = ArrayUtility.inputArray();

		int max = Integer.MIN_VALUE;
		for (int num : arr)
		{
			if(max < num) 
			{
				max=num;
			}
		}
		System.out.println("Maximum number from array is: " + max);
	}
}