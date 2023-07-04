package leetCodeProblems;

public class MaxCircularSubarraySum {

	public static void main(String[] args) {

		int arr[] = new int[] { -3, -2, -3 };

		System.out.println(findTheCirsubarraySum(arr));
	}

	private static int findTheCirsubarraySum(int[] arr) {

		int res = kadaneAlgo(arr);

		if (res < 0) {
			return res;
		}

		// System.out.println(res);
		int totsum = 0;

		for (int i = 0; i < arr.length; i++) {
			totsum += arr[i];
			arr[i] = -arr[i];
		}

		int sum = kadaneAlgo(arr);
		System.out.println(sum);
		int finalres = sum + totsum;
		System.out.println(finalres);

		return Math.max(finalres, res);
	}

	private static int kadaneAlgo(int[] arr) {

		int maxSum = arr[0], res = arr[0];
		for (int i = 1; i < arr.length; i++) {
			maxSum = Math.max(arr[i], maxSum + arr[i]);
			res = Math.max(res, maxSum);
		}
		return res;
	}

}
