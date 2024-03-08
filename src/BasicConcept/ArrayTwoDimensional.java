package BasicConcept;

public class ArrayTwoDimensional {

	public static void main(String[] args) 
	{
		
		int [][] arr = {{10,40,50},{70,80,30}};
	
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
