package BinarySearchQuestions;

public class FindMininSorted_rotatedArr {

	public static void main(String[] args) {

		int arr[] = {11,13,15,17 };

		System.out.println(findMINelement(arr));
	}

	private static int findMINelement(int[] arr) {

		int n = arr.length;
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if ((mid == 0 || arr[mid] < arr[mid - 1]) && (mid == n - 1 || arr[mid] < arr[mid + 1])) {
				return arr[mid];
			} else if (arr[low] <= arr[mid] && arr[low] > arr[high]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}
