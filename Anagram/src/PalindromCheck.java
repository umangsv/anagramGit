
public class PalindromCheck {

	public static boolean check(String input) {
		
		System.out.println("length is : " + input.length());

		String rev = "";

		for (int i = input.length()-1; i >=0 ; i--) {

			rev = rev + input.charAt(i);
		}

		if (rev.equals(input)) {

			return true;
		}

		else
			return false;
	}

	public static void main(String[] args) {

		
		boolean b = check("yahooooooo");
		System.out.println("string is palindrome or not : " + b);
		
	}

}
