package leetCodeProblems;

import java.util.HashSet;

public class LeftRepeatingIndex {

	public static void main(String[] args) {

		int arr[] = new int[] { 10, 20, 20, 20, 20, 20, 20 };

		int x = 20;
		System.out.println(findtheleftMostrepeatIndex(arr, x));
	}

	private static int findtheleftMostrepeatIndex(int[] arr, int x) {

		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == x) {
				if (mid == 0 || arr[mid - 1] != arr[mid]) {
					return mid;
				} else if (arr[mid - 1] == arr[mid]) {
					high = mid - 1;
				}
			} else if (arr[mid] > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
