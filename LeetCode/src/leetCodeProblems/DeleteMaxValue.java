package leetCodeProblems;

import java.util.Arrays;

public class DeleteMaxValue {

	public static void main(String[] args) {

		long sum = 0;

		int arr[][] = { { 1, 2, 4 }, { 3, 3, 1 }, { 4, 5, 6 } };
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print(arr[i][j] + " ");
//
//			}
//			System.out.println();
//		}

		for (int i = 0; i < arr[0].length; i++) {
			int max = 0;
			for (int j = 0; j < arr.length; j++) {
				max = Math.max(arr[j][i], max);
			}
			//System.out.println(max);
			sum += max;
		}
		System.out.println(sum);

	}

}
