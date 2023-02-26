package leetCodeProblems;

import java.util.Scanner;

public class DiffBtwnElement_DigitSum2535 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(differenceOfSum(arr));
	}

	private static int differenceOfSum(int[] nums) {

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		int digitSum = 0;
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			while (temp != 0) {
				digitSum += temp % 10;
				temp /= 10;

			}
		}
		return Math.abs(sum - digitSum);
	}

}
