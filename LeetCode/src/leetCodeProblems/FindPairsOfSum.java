package leetCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FindPairsOfSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };

		int k = 7;

		findThePairsSumOfTarget(arr, k);
	}

	private static void findThePairsSumOfTarget(int[] arr, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}

//		for (int i = 0; i < arr.length / 2; i++) {
//			if (map.containsKey(k - arr[i])) {
//				System.out.println(arr[i] + " " + (k - arr[i]));
//			}
//		}

		List<List<Integer>> list1 = new ArrayList<>();

		for (int i = 0; i < arr.length / 2; i++) {
			if (map.containsKey(k - arr[i])) {
				List<Integer> list = new ArrayList<>();
				list.add(arr[i]);
				list.add(k - arr[i]);
				list1.add(list);
			}

		}
		System.out.println(list1);
	}

}
