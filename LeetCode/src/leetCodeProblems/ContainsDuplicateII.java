package leetCodeProblems;

import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicateII {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nums[] = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		if (containsNearbyDupl(nums, n, k)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	private static boolean containsNearbyDupl(int[] nums, int n, int k) {

		HashMap<Integer, Integer> mp = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (mp.containsKey(nums[i]) && Math.abs(mp.get(nums[i]) - i) <= k) {
				return true;
			}
			mp.put(nums[i], i);
		}

		return false;
	}

}
