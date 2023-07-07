package leetCodeProblems;

import java.util.Scanner;

public class MinTimeTrain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int arr1[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println(findMinTime(arr, arr1, n, t));
	}

	private static int findMinTime(int[] arr, int[] arr1, int n, int t) {

		int max=Integer.MIN_VALUE,res=-1;
		
		for (int i = 0; i < n; i++) {
			if (arr1[i] <= t) {
				max=Math.max(max, arr[i]);
				res=max;
			}
		}

		return res;
	}

}
