package Array;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 4, 7, 10, 6, 5 };
		printArray(arr);
		int[] reversedArray = reverseArray(arr, 0, arr.length - 1);
		printArray(reversedArray);
	}

	private static int[] reverseArray(int[] arr, int start, int end) {

		while (start < end) {
			// store start index element in temp
			int tmp = arr[start];
			// assign end index element to start index
			arr[start] = arr[end];
			// now assign tmp value to end index
			arr[end] = tmp;
			// increase start index by 1
			start++;
			// decrease end index by 1
			end--;

		}
		return arr;

	}

	private static void printArray(int[] reversedArray) {

		int n = reversedArray.length;

		for (int i = 0; i < n; i++) {
			System.out.print(reversedArray[i] + " ");
		}
		System.out.println();

	}

}
