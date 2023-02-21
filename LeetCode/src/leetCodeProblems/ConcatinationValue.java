package leetCodeProblems;

import java.util.Scanner;

public class ConcatinationValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(findTheArrayConcVal(arr, n));
	}

	private static long findTheArrayConcVal(int[] arr, int n) {
		int i = 0, j = n - 1;
		long sum = 0;
		String str = "";
		while (i < j) {
			str += arr[i];
			str += arr[j];

			sum += Long.parseLong(str);

			str = "";
			i++;
			j--;
		}

		if (n % 2 != 0) {
			int mid = n / 2;
			sum += arr[mid];
			return sum;
		} else {
			return sum;
		}

	}

}
