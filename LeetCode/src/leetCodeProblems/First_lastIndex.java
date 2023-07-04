package leetCodeProblems;

public class First_lastIndex {

	public static void main(String[] args) {

		int arr[] = new int[] { 5, 7, 7, 8, 8, 10 };
		int target = 8;

		int res[] = searchIndex(arr, target);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

	private static int[] searchIndex(int[] nums, int target) {

		int res[] = new int[2];
		res[0] = -1;
		res[1] = -1;
		int low = 0, high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				res[0] = mid;
				high = mid - 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		low = 0;
		high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target) {
				res[1] = mid;
				low = mid + 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return res;
	}

}
