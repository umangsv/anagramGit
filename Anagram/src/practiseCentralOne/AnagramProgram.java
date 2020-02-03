package practiseCentralOne;

import java.util.Arrays;

public class AnagramProgram {

	public static boolean checkAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {

			System.out.println("strings are not anagram");

			return false;
		}

		else {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			boolean b1 = Arrays.equals(arr1, arr2);

			return b1;
		}
	}

	public static void main(String[] args) {

		boolean b = checkAnagram("peek", "keep");
		System.out.println("strings are anagram : " + b);
	}

}
