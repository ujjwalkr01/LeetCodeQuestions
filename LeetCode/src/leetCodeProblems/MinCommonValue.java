package leetCodeProblems;

import java.util.Scanner;

public class MinCommonValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int arr1[] = new int[n];
		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println(getCommon(arr, arr1));

	}

	private static int getCommon(int[] nums1, int[] nums2) {

		int i = 0, j = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				return nums1[i];
			}
		}
		return -1;
	}

}
