package leetCodeProblems;

public class noOfAdjacentElement {

	public static void main(String[] args) {

		int arr[][] = new int[][] { { 0, 2 }, { 1, 2 }, { 3, 1 }, { 1, 1 }, { 2, 1 } };

		int n = 4;

		findtheAdjacentEle(arr, n);
	}

	private static void findtheAdjacentEle(int[][] queries, int n) {

		int nums[] = new int[n];
		int res[] = new int[queries.length];
		int count = 0;
		for (int i = 0; i < queries.length; i++) {
			int index = queries[i][0], color = queries[i][1];

			int prev = (index > 0) ? nums[index - 1] : 0;
			int next = (index < n - 1) ? nums[index + 1] : 0;

			if (nums[index] != 0 && nums[index] == prev) {
				count--;
			}
			if (nums[index] != 0 && nums[index] == next) {
				count--;
			}

			nums[index] = color;

			if (nums[index] == prev) {
				count++;
			}
			if (nums[index] == next) {
				count++;
			}
			res[i] = count;
		}

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
