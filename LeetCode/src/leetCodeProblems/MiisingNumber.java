package leetCodeProblems;

import java.util.HashSet;
import java.util.Scanner;

public class MiisingNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		findMissingNumber(arr, n);
	}

	private static void findMissingNumber(int arr[], int n) {

		HashSet<Integer> set = new HashSet<>();

		for (int num : arr) {
			set.add(num);
		}

		for (int i = 1; i <= n; i++) {
			if (!set.contains(i)) {
				System.out.print(i + " ");
			}
		}

	}

}
