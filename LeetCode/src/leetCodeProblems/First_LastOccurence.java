package leetCodeProblems;

public class First_LastOccurence {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 1, 1, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10,
				10 };
		int x = 8;

		int firstOccur = findFirstOccurence(arr, x);
		int lastOccur = findLastOccurence(arr, x);
		System.out.println(firstOccur + " " + lastOccur);

	}

	private static int findLastOccurence(int[] arr, int x) {

		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == x) {
				if (mid == arr.length - 1 || arr[mid + 1] != arr[mid]) {
					return mid;
				} else {
					low = mid + 1;
				}
			} else if (arr[mid] > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	private static int findFirstOccurence(int[] arr, int x) {

		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == x) {
				if (mid == 0 || arr[mid - 1] != arr[mid]) {
					return mid;
				} else {
					high = mid - 1;
				}
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}
