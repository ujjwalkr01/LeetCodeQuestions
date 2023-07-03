package BinarySearchQuestions;

public class FndPeakElements {

	public static void main(String[] args) {

		int arr[] = { 4, 2, 3,1};

		System.out.println(findPeakEle(arr));
	}

	private static int findPeakEle(int[] arr) {
		int n = arr.length;
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == n - 1 || arr[mid] > arr[mid + 1])) {
				return mid;
			} else if (arr[mid] > arr[mid - 1]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}
