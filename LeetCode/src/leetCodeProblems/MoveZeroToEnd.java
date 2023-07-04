package leetCodeProblems;

public class MoveZeroToEnd {

	public static void main(String[] args) {

		int arr[] = new int[] { 10, 0, 20, 0, 30, 0, 0, 40 };
		removeZeroToEnd(arr);
	}

	private static void removeZeroToEnd(int[] arr) {

		int countZero = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				swap(arr, i, countZero);
				countZero++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void swap(int arr[], int i, int countZero) {

		int temp = arr[i];
		arr[i] = arr[countZero];
		arr[countZero] = temp;

	}

}
