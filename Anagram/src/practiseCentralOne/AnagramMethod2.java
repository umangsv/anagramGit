package practiseCentralOne;

public class AnagramMethod2 {

	public static boolean checkAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		int[] charSequence = new int[256];

//		System.out.println("lets check for str1 " + charSequence[str1.charAt(0)]);
//		System.out.println("lets check for str2 " + charSequence[str2.charAt(0)]);
//
//		System.out.println("lets check for str1 " + str1.charAt(0));
//		System.out.println("lets check charSequence " + charSequence[97]);

		for (int i = 0; i < str1.length(); i++) {

			charSequence[str1.charAt(i)]++;
			charSequence[str2.charAt(i)]--;

		}

		for (int i = 0; i < 256; i++) {

			if (charSequence[i] != 0) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {

		boolean b = checkAnagram("keek", "keep");
		System.out.println("strings are anagram : " + b);

	}

}
