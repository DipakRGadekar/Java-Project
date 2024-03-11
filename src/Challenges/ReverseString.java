package Challenges;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Welcome";
		String reverse = "";
		String rev = "";
		
		//Approach 1
		for (int i=s.length()-1; i>=0;i--) 
		{
			reverse = reverse + s.charAt(i);
		}
		System.out.println("Reverse String using charAt[]: " + reverse);
		
		//Approach 2
		
		char[] chararray = s.toCharArray();
	
		for (int i=chararray.length-1; i>=0;i--) 
		{
			rev = rev + chararray[i];
		}
		System.out.println("Using char Array: " + rev);
	}
}
