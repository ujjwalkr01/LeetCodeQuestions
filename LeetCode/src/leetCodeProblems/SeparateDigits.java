package leetCodeProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class SeparateDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		int arr[] = separateDigit(nums, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int[] separateDigit(int[] nums, int n) {
		String str = "";
		for (int i = 0; i < n; i++) {

			str += String.valueOf(nums[i]);
		}
		
		int arr[] = new int[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}
		return arr;
	}

}
