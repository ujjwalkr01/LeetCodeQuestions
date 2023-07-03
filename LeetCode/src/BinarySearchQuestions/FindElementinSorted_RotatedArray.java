package BinarySearchQuestions;

public class FindElementinSorted_RotatedArray {

	public static void main(String[] args) {

		int arr[] = { 3, 1 };
		int target = 1;
		System.out.println(findTargetELe(arr, target));
	}

	private static int findTargetELe(int[] arr, int target) {

		int n = arr.length;
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[low] <= arr[mid]) {
				if (target >= arr[low] && target < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (target > arr[mid] && target <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

}
