package leetCodeProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoOutOfThree {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 1, 3, 2 };
		int arr1[] = new int[] { 2, 3 };
		int arr2[] = new int[] { 3 };

		FindCommonInanyofTwo(arr, arr1, arr2);
	}

	private static void FindCommonInanyofTwo(int[] nums1, int[] nums2, int[] nums3) {

		boolean[] b1 = new boolean[101];
		boolean[] b2 = new boolean[101];
		boolean[] b3 = new boolean[101];

		/**
		 * where values of the boolean array at the corresponding index are changed to
		 * true
		 */
		for (int num : nums1)
			b1[num] = true;

		for (int num : nums2)
			b2[num] = true;

		for (int num : nums3)
			b3[num] = true;

		List<Integer> res = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			if ((b1[i] || b2[i]) && (b2[i] || b3[i]) && (b3[i] || b1[i]))
				res.add(i);
		}
		// return res;
		System.out.println(res);
	}

}
