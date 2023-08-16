package leetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class GroupNumbers {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 2, 1, 1 };
		int n = arr.length;

		findNumber(arr, n);
	}

	private static void findNumber(int[] arr, int n) {

//		HashMap<Integer, Integer> map = new HashMap<>();
//
//		for (int num : arr) {
//			map.put(num, map.getOrDefault(num, 0) + 1);
//		}
//		System.out.println(map);

//		for(Map.Entry<Integer, Integer> mp:map.entrySet()) {
//			if(mp.getValue())
//		}

//		for(int num:arr) {
//			
//		}

		int count[] = new int[n];

		for (int i = 0; i < n; i++) {
			count[arr[i]]++;
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			System.out.println(count[i]);
			max = Math.max(max, count[i]);
		}
		System.out.println(max);

		for (int i = n - 1; i >= 0; i--) {
			if (count[i] == 0) {
				continue;
			} else {
				if (count[i] == max) {
					System.out.println(i);
				} else {
					System.out.println(i);
				}
			}
		}
	}

}
