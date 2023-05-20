package leetCodeProblems;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = sc.nextInt();

		rotateArray(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void rotateArray(int[] arr, int k) {

		while (k > arr.length) {
			k -= arr.length;
		}

		int n = arr.length - 1;
		reverse(arr, n, n - k + 1);
		reverse(arr, n - k, 0);
		reverse(arr, n, 0);

	}

	private static void reverse(int[] nums, int low, int high) {
		//System.out.println(low + " " + high);
		while (low >= high) {
			int temp = nums[low];
			// System.out.println(temp);
			nums[low] = nums[high];
			nums[high] = temp;
			low--;
			high++;
		}

	}

}
