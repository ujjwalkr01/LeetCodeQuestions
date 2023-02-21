package leetCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class TakeMaxPile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(takePile(arr, k));
	}

	private static long takePile(int[] arr, int k) {
		int n = arr.length;
		while (k-- != 0) {
			Arrays.sort(arr);

			arr[n - 1] = (int) (Math.sqrt(arr[n - 1]));
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
