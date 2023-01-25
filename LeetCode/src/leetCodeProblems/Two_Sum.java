package leetCodeProblems;

import java.util.Scanner;

public class Two_Sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();

		int sum[] = twoSum(arr, n, target);
		for (int i = 0; i < sum.length; i++) {
			System.out.print(sum[i] + " ");
		}
	}

	private static int[] twoSum(int[] arr, int n, int target) {

		int left = 0, right = n - 1;
		while (left < right) {
			if (arr[left] + arr[right] == target) {
				return new int[] { left, right };
			} else if (arr[left] + arr[right] > target) {
				right--;
			} else {
				left++;
				right = n - 1;
			}
		}
		return null;
	}

}
