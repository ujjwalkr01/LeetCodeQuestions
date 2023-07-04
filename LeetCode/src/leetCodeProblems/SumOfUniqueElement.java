package leetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElement {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 2 };
		System.out.println(sumOfUniqueEle(arr));
	}

	private static int sumOfUniqueEle(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int sum = 0;
		for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
			if (mp.getValue() == 1) {
				sum += mp.getKey();
			}
		}
		return sum;

	}

}
