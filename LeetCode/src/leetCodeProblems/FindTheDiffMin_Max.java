package leetCodeProblems;

import java.util.Scanner;

public class FindTheDiffMin_Max {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(findDiff(arr, n));
	}

	private static int findDiff(int[] arr, int n) {

		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			max = Math.max(arr[i], max);
			min = Math.min(arr[i], min);
		}

		return (max - min);
	}

}
