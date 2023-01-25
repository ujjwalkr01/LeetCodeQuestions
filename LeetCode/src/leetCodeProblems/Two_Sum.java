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

		int i = 0, j = i+1;
		while (i < j) {
			if (arr[i] + arr[j] == target) {
				return new int[] { i, j };
			} else if (j==n-1) {
				i++;
				j=i+1;
			} else {
				j++;
			}
		}
		return null;
	}

}
