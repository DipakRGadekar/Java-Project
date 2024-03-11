package Challenges;

public class ArraySum {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int sum = 0;
		int add = 0;
		System.out.println("Using For each loop");
		for (int i : a)
		{
			sum = i + sum;
		}
		System.out.println(sum);
		
		System.out.println("Using Normal For loop");
		for (int j=0; j<= a.length;j++) 
		{
			add = j+ add;
		}
		System.out.println(add);
	}
}
