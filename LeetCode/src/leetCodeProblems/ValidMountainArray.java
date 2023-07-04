package leetCodeProblems;

import java.util.Scanner;

public class ValidMountainArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		if (mountainArray(arr)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean mountainArray(int[] arr) {

		if (arr.length <= 2) {
			return false;
		}
		int max = Integer.MIN_VALUE, ind = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				ind = i;
			}
		}
		// System.out.print(max+" "+ind);
		boolean inOrder = false;
		for (int i = 0; i < ind; i++) {
			if (arr[i] < arr[i + 1]) {
				inOrder = true;
			} else {
				inOrder = false;
				break;
			}
		}
		boolean inord = false;
		for (int i = ind; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				inord = true;
			} else {
				inord = false;
				break;
			}
		}
		return (inord && inOrder) ? true : false;

	}

}
