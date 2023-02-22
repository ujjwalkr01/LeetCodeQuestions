package leetCodeProblems;

import java.util.Scanner;

public class MedianOftwoSortedArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nums1[] = new int[n];

		for (int i = 0; i < n; i++) {
			nums1[i] = sc.nextInt();
		}

		int m = sc.nextInt();

		int nums2[] = new int[m];

		for (int i = 0; i < m; i++) {
			nums2[i] = sc.nextInt();
		}

		System.out.print(String.format("%.4f", findMedianSortedArrays(nums1, nums2)));
	}

	private static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int i = 0, j = 0, k = 0;
		int arr[] = new int[nums1.length + nums2.length];

		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] <= nums2[j]) {
				arr[k++] = nums1[i++];
			} else {
				arr[k++] = nums2[j++];
			}
		}
		while (i < nums1.length) {
			arr[k++] = nums1[i++];
		}
		while (j < nums2.length) {
			arr[k++] = nums2[j++];
		}
		for (int l = 0; l < arr.length; l++) {
			System.out.print(arr[l] + " ");
		}

		return findMedian(arr);
	}

	private static double findMedian(int[] arr) {
		if (arr.length % 2 == 0) {
			double med =(double) (arr[(arr.length) / 2] + arr[(arr.length - 1) / 2]) / 2;
			return med;
		} else {
			double med = (double)arr[arr.length / 2];
			return med;
		}

	}

}
