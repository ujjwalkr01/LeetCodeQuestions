package leetCodeProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MaxNumberOfPairs {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 1 };
		findMaxPair(arr);
	}

	private static void findMaxPair(int[] nums) {

		if (nums.length == 1) {
			System.out.println(0 + " " + 1);
			return;
		}

		HashSet<Integer> set = new HashSet<>();

		int pairs = 0;
		for (int i : nums) {
			if (!set.contains(i)) {
				set.add(i); // No pair present
			} else {
				set.remove(i); // Pair found
				pairs++;
			}
		}

		// return new int[]{pairs,set.size()};

		System.out.println(pairs + " " + pairs);

	}

}
