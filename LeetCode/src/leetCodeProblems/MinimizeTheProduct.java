package leetCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeTheProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int arr1[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println(findtheMinProductValue(arr, arr1, n));
	}

	private static int findtheMinProductValue(int[] arr, int[] arr1, int n) {

		int pro = 1, sum = 0;
		Arrays.sort(arr);
		Arrays.sort(arr1);

		int i = 0, j = n - 1;

		while (i < n && j >= 0) {
			pro = arr[i++] * arr1[j--];
			sum += pro;
		}

		return sum;
	}

}
