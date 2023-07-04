package leetCodeProblems;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class SumII {

	public static void main(String[] args) {

		int arr[] = new int[] { 2, 7, 11, 15 };
		int target = 9;

		findTheSumPairIndex(arr, target);
	}

	private static void findTheSumPairIndex(int[] arr, int target) {

		int res[] = new int[2];

		int start = 0, end = arr.length - 1;

		while (start < end) {
			if (arr[start] + arr[end] > target) {
				end--;
			} else if (arr[start] + arr[end] < target) {
				start++;
			} else {
				res[0] = start + 1;
				res[1] = end + 1;
				break;
			}
		}

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
