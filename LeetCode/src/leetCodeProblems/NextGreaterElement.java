package leetCodeProblems;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {

		int nums1[] = { 4, 1, 2 };
		int nums2[] = { 1, 3, 4, 2, 5 };

		nextGreaterELement(nums1, nums2);
	}

	private static void nextGreaterELement(int[] nums1, int[] nums2) {

		Stack<Integer> st = new Stack<>();

		int arr[] = new int[nums2.length];

		st.push(nums2[nums2.length - 1]);
		arr[arr.length - 1] = -1;

		for (int i = nums2.length - 2; i >= 0; i--) {

			while (!st.isEmpty() && st.peek() <= nums2[i]) {
				st.pop();
			}

			int ele = st.isEmpty() ? -1 : st.peek();
			arr[i] = ele;

			st.push(nums2[i]);
		}

//		System.out.println(st);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		findNextGreater(arr, nums1, nums2);

	}

	private static void findNextGreater(int[] arr, int[] nums1, int[] nums2) {

		HashMap<Integer, Integer> mp = new HashMap<>();

		for (int i = 0; i < nums2.length; i++) {
			mp.put(nums2[i], i);
		}
		//System.out.println(mp);
		int ans[] = new int[nums1.length];

		for (int i = 0; i < nums1.length; i++) {
			if (mp.containsKey(nums1[i])) {
				ans[i] = arr[mp.get(nums1[i])];
			} else {
				ans[i] = -1;
			}
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

}
