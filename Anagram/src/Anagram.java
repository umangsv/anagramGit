import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String str1, String str2) {

		String s1 = str1.replaceAll(" ", "");
		System.out.println("lets print s1" + s1 + "hello");
		
		String s2 = str2.replaceAll(" ", "");
		System.out.println("lets print s2" + s2 +"hello");
		
		boolean status = true;
		
		if(s1.length()!=s2.length())
		{
			status = false;
		}
		
		else
		{
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			status = Arrays.equals(arr1, arr2);
			
		}
		
		if(status)
		{
			System.out.println("strings are anagram");
			
			return status;
		}
		else {
			System.out.println("strings are not anagram");
			
			return status;
		}
		
	}
	
	
	public static void main(String[] args) {
		
	 boolean check = isAnagram(" keep ", " peek ");
		
	 System.out.println("in main method : " + check);
		
	}

}
