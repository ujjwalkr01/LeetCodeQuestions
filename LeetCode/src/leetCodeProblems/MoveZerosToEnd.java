package leetCodeProblems;

import java.util.Scanner;

public class MoveZerosToEnd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nums[] = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		moveZero(nums);

	}

	private static void moveZero(int[] nums) {

		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[count];
				nums[count] = temp;

				count++;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
