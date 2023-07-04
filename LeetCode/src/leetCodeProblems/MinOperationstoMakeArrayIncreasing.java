package leetCodeProblems;

public class MinOperationstoMakeArrayIncreasing {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 5, 2, 4, 1 };
		System.out.println(countArrayOperation(arr));
	}

	private static int countArrayOperation(int[] nums) {

		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			int num = nums[i + 1];
			if (num <= nums[i]) {
				count += (nums[i] - num) + 1;
				num += (nums[i] - num) + 1;
			}
			nums[i + 1] = num;
		}
		return count;
	}

}
