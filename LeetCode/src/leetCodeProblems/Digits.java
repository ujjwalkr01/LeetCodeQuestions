package leetCodeProblems;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int digits[] = new int[n];
		for (int i = 0; i < n; i++) {
			digits[i] = sc.nextInt();
		}
		int arr[] = plusOne(digits);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	private static int[] plusOne(int[] digits) {

		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;  
		 }                   

			digits[i] = 0;
		}

		int[] arr = new int[n + 1];
		arr[0] = 1;

		return arr;
	}

}
