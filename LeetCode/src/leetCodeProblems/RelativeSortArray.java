package leetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RelativeSortArray {

	public static void main(String[] args) {

		int arr1[] = new int[] { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
		int arr2[] = new int[] { 2, 1, 4, 3, 9, 6 };
		relativSortArray(arr1, arr2);
	}

	private static void relativSortArray(int[] arr1, int[] arr2) {

//		Arrays.sort(arr1);
//		HashMap<Integer, Integer> map = new HashMap<>();
//
//		for (int num : arr1) {
//			map.put(num, map.getOrDefault(num, 0) + 1);
//		}
//		System.out.println(map);
//		int res[] = new int[arr1.length];
//		int i = 0;
//		for (int num : arr2) {
//			int k = map.get(num);
//
//			while (k-- != 0) {
//				res[i++] = num;
//			}
//		}
//		HashSet<Integer> set = new HashSet<>();
//		for (int num1 : arr2) {
//			set.add(num1);
//		}
//		for (int num : arr1) {
//			if (!set.contains(num)) {
//				res[i++] = num;
//			}
//		}
//		for (int j = 0; j < res.length; j++) {
//			System.out.print(res[j] + " ");
//		}

		int count[] = new int[1001];
		int res[] = new int[arr1.length];
		int j = 0;

		for (int i : arr1) {
			count[i]++;
		}

		for (int i : arr2) {
			while (count[i]-- > 0) {
				res[j++] = i;
			}
		}

		for (int i = 0; i < 1001; i++) {
			if (count[i] > 0) {
				while (count[i]-- > 0) {
					res[j++] = i;
				}
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}

}
