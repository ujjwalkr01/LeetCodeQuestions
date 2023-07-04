package leetCodeProblems;

import java.util.Scanner;

public class SortOfArrayPriorityII {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int res[] = sortArrayByParityII(arr);
	}

	private static int[] sortArrayByParityII(int[] nums) {

		int arr[] = new int[nums.length];
		int j = 0, k = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				arr[j] = nums[i];
				j += 2;
			} else {
				arr[k] = nums[i];
				k += 2;
			}
		}

		return arr;
	}

}
