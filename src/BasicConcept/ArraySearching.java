package BasicConcept;
import java.util.Scanner;

public class ArraySearching {
	public static void main(String[] args) {
		int[] arr = { 12, 35, 46, 88, 99, 70 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to match Number in Array");
		System.out.println("Enter the number which you want to check in Array: ");

		int use = sc.nextInt();
		boolean call = checkMethod(use, arr);
		if (call) {
			System.out.println("Your number " + use + " is present");
		}else {
			System.out.println("Sorry, Your number does not exist");
		}

	}

	public static boolean checkMethod(int use,int arr[]) {
		int i = 0;

		while (i < arr.length) {
			if (use == arr[i]) {
				
				return true;
			}
			i++;
		}
		return false;
	}

}
