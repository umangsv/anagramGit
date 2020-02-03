
public class IntegerPalindrom {

	public static boolean checkPalindrome(int num) {

		int sum = 0;
		int r;

		int originalNum = num;

		while (num > 0) {

			r = num % 10; // 454 == 4
			sum = sum * 10 + r; //
			num = num / 10;

		}

		if (sum == originalNum) {

			return true;
		}

		else
			return false;

	}

	public static void main(String[] args) {

		boolean b = checkPalindrome(55553);
		System.out.println("number is palindrome or not : " + b);

	}
}
