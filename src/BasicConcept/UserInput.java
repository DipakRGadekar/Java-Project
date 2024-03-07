package BasicConcept;
import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter your username: ");
	String userName= input.nextLine();
	System.out.println("Good Morning " + userName);
	System.out.println(userName + ", Also tell me your age");
	int age = input.nextInt();
	System.out.println("My age is: " + age);
	
	
}
}
