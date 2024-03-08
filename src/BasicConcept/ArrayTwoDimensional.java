package BasicConcept;

public class ArrayTwoDimensional {

	public static void main(String[] args) 
	{
		
		int [][] arr = {{10,40,50},{70,80,30}};
	
		System.out.println("Print the number present in row 0 and column 2: " + arr[0][2]);
		
		for (int i =0; i<=1; i++) 
		{
			for(int j =0; j<=2; j++)  
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
