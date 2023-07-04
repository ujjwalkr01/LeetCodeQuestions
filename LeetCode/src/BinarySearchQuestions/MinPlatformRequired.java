package BinarySearchQuestions;

import java.util.Arrays;

public class MinPlatformRequired {

	public static void main(String[] args) {

		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		int n = arr.length;

		System.out.println(findThePlatformReq(arr, dep, n));
	}

	private static int findThePlatformReq(int[] arr, int[] dep, int n) {

		int platform = 0, train = 0, i = 0, j = 0;

		Arrays.sort(arr);
		Arrays.sort(dep);

		while (i < n && j < n) {
			if (arr[i] <= dep[j]) {
				train++;
				i++;
			} else {
				train--;
				j++;
			}
			platform = Math.max(train, platform);
		}

		return platform;
	}

}
