package leetCodeProblems;

import java.net.Inet4Address;

public class MinSizeSubarr {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 4, 4 };
		int target = 10;

		System.out.println(findtheSum(arr, target));
	}

	private static int findtheSum(int[] arr, int target) {

		int j = 0, sum = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			while (sum >= target) {
				min = Math.min(min, i - j + 1);
				sum -= arr[j];
				j++;
			}

		}

		return min == Integer.MAX_VALUE ? 0 : min;
	}

}
