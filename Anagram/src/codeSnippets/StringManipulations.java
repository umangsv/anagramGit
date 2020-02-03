package codeSnippets;

public class StringManipulations {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		char abc = 0 ;
		
		if(s1.equals(s2))
		{
			
			if(s1 == s2)
			{
				abc = s1.charAt(2);
			}
			
			else
			{
				abc =  s1.charAt(2);
			}
		}
		
		System.out.println("value of char is : " + abc);
		
	}
	// remember, charAt(i) return char value
	
}
