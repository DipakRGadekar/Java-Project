package Challenges;

import java.util.Scanner;

public class swap {
public static void main(String[] args) {
	int x= 25;
	System.out.println("X original value: " + x);
	int y = 33;
	System.out.println("Y original value: " + y);
	int z=x;
	x=y;
	System.out.println("X value after swap is: " + x);
	y= z;
	System.out.println("Y value after swap is: " + y);
	
	swapScanner();
}

public static void swapScanner() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two number to swap");
	System.out.println("original value of a: " );
	int a = sc.nextInt();
	System.out.println("original value of b: " );
	int b = sc.nextInt();
	int c=a;
	 a = b;
	System.out.println(" a value after swap is: " + a);
	b=c;
	System.out.println(" b value after swap is: " + b);

}
}
