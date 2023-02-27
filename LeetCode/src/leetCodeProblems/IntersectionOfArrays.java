package leetCodeProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfArrays {

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
		int arr[] = findIntersection(nums1, nums2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static int[] findIntersection(int[] nums1, int[] nums2) {

		Set<Integer> set = new HashSet<>();
		Set<Integer> common = new HashSet<>();

		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		System.out.println(set);

		for (int i = 0; i < nums2.length; i++) {
			if (set.contains(nums2[i])) {
				common.add(nums2[i]);
			}
		}
		System.out.println(common);
		int arr[] = new int[common.size()];
		int i = 0;
		for (int num : common) {
			arr[i++] = num;
		}
		return arr;
	}

}
