package BasicConcept;

public class Functions {
	public static void main(String[] args) {
		// greeting();
		// RightHalfPyramid();
       //ReverseHalfPyramid();
		leftHalfPyramid();
	}

	public static void greeting() {
		System.out.println("Good morning from Dipak");
	}

	public static void RightHalfPyramid() {
		System.out.println("Right Half Pyramid");
		/*
		 *
		 * *
		 * * *
		 * * * *
		 * * * * *
		 */
		int row = 0;
		while (row < 5) {
			System.out.print("*");
			int colu = 0;
			while (colu < row) {
				System.out.print(" *");
				colu++;
			}
			row++;
			System.out.println();
		}
	}

	public static void ReverseHalfPyramid() {
		System.out.println("Reverse Half Pyramid");
		/*
		 *****
		 ****
		 ***
		 **
		 *
		 */
		int a = 0;
		while (a < 5) {
			System.out.print("*");

			int b = 4;
			while (b > a) {
				System.out.print("*");
				b--;
			}
			a++;
			System.out.println();
		}
	}

	public static void leftHalfPyramid() {
		System.out.println("Left Half Pyramid");
		int row = 1;
		while (row <= 5) {
		    int space = 5 - row;
		    int stars = row;
		    
		    // Print spaces
		    int spaceCount = 0;
		    while (spaceCount < space) {
		        System.out.print(" ");
		        spaceCount++;
		    }
		    
		    // Print stars
		    int starCount = 0;
		    while (starCount < stars) {
		        System.out.print("*");
		        starCount++;
		    }
		    
		    // Move to the next line
		    System.out.println();
		    
		    // Move to the next row
		    row++;
		}

	}
}
