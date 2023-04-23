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

	private static void FindCommonInanyofTwo(int[] arr, int[] arr1, int[] arr2) {

		List<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();

		for (int n1 : arr) {
			set.add(n1);
		}

		for (int n2 : arr1) {
			if (set.contains(n2) && !list.contains(n2)) {
				list.add(n2);
			}
		}
		for (int n3 : arr2) {
			if (set.contains(n3) && !list.contains(n3)) {
				list.add(n3);
			}
		}
		System.out.println(list);
	}

}
