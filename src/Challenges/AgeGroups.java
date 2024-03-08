package Challenges;

import java.util.Scanner;

public class AgeGroups {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to identify Age groups");
		System.out.println("Please Enter your age: ");
		int age = input.nextInt();
if(age<=13) {
	System.out.println("You are in child group");
}
else if(age<=20) {
	System.out.println("Your are in Teen group");
}else if(age<=60) {
	System.out.println("You are in Adult group");
}else {
	System.out.println("You are in senior group");
}
	}

}
