package BasicConcept;
import java.util.Scanner;

public class voidReturn {
	public static void main(String[] args) {
		System.out.println("Addition of two number program");
		int firstNum = addition();
		int secondNum = addition();
		System.out.println("Addition of two number is: " + (firstNum + secondNum));
	}

	public static Integer addition() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please, Enter your number: ");
		int no1 = input.nextInt();
		return no1;

	}
	
}
