package Challenges;

import java.util.Scanner;

public class GradesPercentage {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to identify Grades base on percentage");
	System.out.println("Please Enter your percentage out of 100 : ");
	float percentage = input.nextFloat();
	
	if (percentage>=90) {
		System.out.println("You got Grade A");
	}
	else if(percentage>=75){
		System.out.println("You got Grade B");
	}
	else if(percentage >=60) {
		System.out.println("You got Grade C");
	}
	else if(percentage >=30) {
		System.out.println("You got Grade D");
	}else {
		System.out.println("You got Grade F");
	}
}
}