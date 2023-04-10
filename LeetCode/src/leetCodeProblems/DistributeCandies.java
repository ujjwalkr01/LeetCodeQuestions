package leetCodeProblems;

import java.util.HashSet;

public class DistributeCandies {

	public static void main(String[] args) {

		int arr[] = new int[] {6,6,6,6};
		System.out.println(canEatDiffCandies(arr));
	}

	private static int canEatDiffCandies(int[] candyType) {

		HashSet<Integer> set = new HashSet<>();
		int n = candyType.length;

		for (int i = 0; i < n; i++) {
			set.add(candyType[i]);
		}

		if (n / 2 >= set.size()) {
			return set.size();
		} else {
			return n / 2;
		}

	}

}
