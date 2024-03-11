package BasicConcept;

public class String_Methods {

	public static void main(String[] args) {
		String s1 = "Dipak Gadekar";
		String s2 = "Priti Gadekar";
		String s3 = "Golden Treasure";
	    String s4 = "   18 Latitude Mall       ";	
	
		System.out.println("Length of String is: " + s1.length());
		
		System.out.println("Check charater at 4: " + s2.charAt(4));
		
		System.out.println("Concatination: " + s1.concat(s2).concat(s3));
		
		System.out.println("Compare string S3 with S2: " + s3.compareTo(s2) );
		System.out.println("Compare ignore cas string S3 with S2: " + s3.compareToIgnoreCase(s2) );
		
		System.out.println("Give me index of G char: " + s1.indexOf('G') );
		
		System.out.println("Last index of r char: " + s3.lastIndexOf('r') );
	
		System.out.println("Replace t with society:  " + s3.replace('T', 'S') );
		
		System.out.println("Replace s2 string to s3: " + s2.replaceAll(s2, s3) );
		
		System.out.println("S1 to lower case: " + s1.toLowerCase() );
		
		System.out.println("S1 to upper case: " + s1.toUpperCase() );
		
		System.out.println("Check s2 string is empty: " + s2.isEmpty() );
			
		System.out.println("Remove space from start and end: "+ s4.trim());
		
		System.out.println("Check s2 contains gadekar: " + s2.contains("Gadekar"));
		
		System.out.println(" Check both string are equal: "+ s1.equals(s2));

		System.out.println("Substring method: "+ s1.substring(0,5));
	}

}
