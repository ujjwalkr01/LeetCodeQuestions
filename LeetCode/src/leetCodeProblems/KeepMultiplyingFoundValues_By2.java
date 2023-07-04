package leetCodeProblems;

import java.util.HashSet;
import java.util.Scanner;

public class KeepMultiplyingFoundValues_By2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] { 5, 3, 6, 1, 12 };
		int original = sc.nextInt();

		System.out.println(findFinalValue(arr, original));
	}

	private static int findFinalValue(int[] nums, int original) {
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		while (set.contains(original)) {
			original *= 2;
		}
		return original;
	}

}
