package leetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class DifferenceOftwoArrays {

	public static void main(String[] args) {

		int arr[] = new int[] { 26, 48, -78, -25, 42, -8, 94, -68, 26 };
		int arr1[] = new int[] { 61, -17 };

		findDinstinct(arr, arr1);
	}

	private static void findDinstinct(int[] nums1, int nums2[]) {

		List<List<Integer>> list = new ArrayList<>();

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

//		Arrays.sort(nums1);
//		Arrays.sort(nums2);

		HashSet<Integer> set = new HashSet();
		for (int num : nums1) {
			set.add(num);
		}

		HashSet<Integer> set1 = new HashSet();
		for (int num1 : nums2) {
			set1.add(num1);
		}
		System.out.println(set1 + " " + set);

//		
//		for(int i=0;i<nums1.length;i++) {
//			if(!set1.contains(nums1[i]) && (i==0 || nums1[i]!=nums1[i-1]) ) {
//				list1.add(nums1[i]);
//			}
//		}
//		for(int i=0;i<nums2.length;i++) {
//			if(!set.contains(nums2[i]) && (i==0 || nums2[i]!=nums2[i-1]) ) {
//				list2.add(nums2[i]);
//			}
//		}

		for (int n1 : set) {
			if (set1.contains(n1)) {
				set1.remove(n1);
			} else {
				list1.add(n1);
			}
		}
		for (int n2 : set1) {
			list2.add(n2);
		}
		list.add(list1);
		list.add(list2);
		System.out.println(list);
	}

}
