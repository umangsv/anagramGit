package practiseCentralOne;

public class SecondHighestNum {

	public static void main(String[] args) {

		int arr[] = { 12, 35, 1, 34 , 99};

		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		largest = arr[0];
		second = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				second = largest;
				largest = arr[i];
			}

			else if (arr[i] > second && arr[i] != largest) {
				second = arr[i];
			}

		}

		System.out.println("largest no is : " + largest);
		System.out.println("second largest no is : " + second);

	}

}
