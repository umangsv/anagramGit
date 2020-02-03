
public class MethodTwoAnagram {

	private static boolean isAnagram(String string1, String string2) {
		// TODO Auto-generated method stub

		if (string1 == null || string2 == null)
			return false;

		/* Length of two strings are not same - return false */
		if (string1.length() != string2.length())
			return false;

		/* Create an integer array to store the frequency of characters */
		int[] charFrequency = new int[256];
		
 		System.out.println("lets check out " + charFrequency[97]);

		System.out.println("string.charAt(0) :" + string1.charAt(0));
		System.out.println("charFrequency :" + charFrequency['v']);

		System.out.println("string.charAt(1) :" + string1.charAt(1));
		System.out.println("charFrequency :" + charFrequency[string1.charAt(1)]);
		
		/* Iterate through the strings */
		for (int i = 0; i < string1.length(); i++) {
			/* increment frequency count in the first string */
			charFrequency[string1.charAt(i)]++;
			/* decrement frequency count in the second string */
			charFrequency[string2.charAt(i)]--;
		}

		/* Check the frequency array */
		for (int i = 0; i < 256; i++) {
			if (charFrequency[i] != 0)
				/* Character set not same - Not an anagram */
				return false;
		}
		/* Strings are anagram */
		return true;

	}

	
	//https://www.algoqueue.com/algoqueue/default/view/7077888/check-whether-two-strings-are-anagram
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean check = isAnagram("viewers", "reviews");

		System.out.println("in main method : " + check);

	}

}
