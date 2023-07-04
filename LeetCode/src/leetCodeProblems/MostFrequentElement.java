package leetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

	public static void main(String[] args) {

		int arr[] = new int[] { 0, 1, 2, 2, 4, 4, 1 };
		System.out.println(findMostFrequentEvenELe(arr));
	}

	private static int findMostFrequentEvenELe(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();
		boolean isEven = false;
		int max = Integer.MIN_VALUE;
		for (int num : nums) {
			if (num % 2 == 0) {
				map.put(num, map.getOrDefault(num, 0) + 1);
				isEven = true;
				max = Math.max(map.get(num), max);
			}
		}

		int min = Integer.MAX_VALUE;
		for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
			if (max == mp.getValue()) {
				min = Math.min(min, mp.getKey());
			}
		}
		return isEven ? min : -1;
	}

}
