package Challenges;

import java.util.Scanner;

public class FahrenheitCelsis {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to temperature convertor\n");
	System.out.println("Enter temp in F: ");
	float f= sc.nextFloat();
	float ds = (f-32)*5.0f/9.0f;
	System.out.println("Your temperature is : " + ds + "C");
}
}
