package Loops;

public class ForEach {

	public static void main(String[] args) {
		String[] array = new String[] { "Dipak", "Ram", "Sham", "Priti", "Yogesh", "Sayli" };
		printArray(array);
		printArrayForEach(array);
	}

	public static void printArrayForEach(String[] array)
	{
		for (String name : array)
		{
			System.out.print(name + " ");
		}
	}

	public static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
