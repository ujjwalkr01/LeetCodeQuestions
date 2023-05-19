package leetCodeProblems;

import java.util.HashMap;

public class FrequenciesOfLimitedRangeArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 3,3,3,3 };
		int p = 3;
		findfrequency(arr, p);
	}

	private static void findfrequency(int[] arr, int p) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		System.out.println(map);
		int j = 0;
		for (int i = 1; i <= arr.length; i++) {
			if (map.containsKey(i)) {
				arr[j++] = map.get(i);
			} else {
				arr[j++] = 0;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
