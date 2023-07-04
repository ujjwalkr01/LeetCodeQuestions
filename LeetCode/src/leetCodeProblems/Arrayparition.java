package leetCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayparition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(arrayPairSum(arr, n));
	}

	private static int arrayPairSum(int[] nums, int n) {

		Arrays.sort(nums);
		int sum = 0;

		for (int i = 0; i < nums.length; i += 2) {
			sum += nums[i];
		}
		return sum;
	}

}
