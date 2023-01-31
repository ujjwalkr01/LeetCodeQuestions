package leetCodeProblems;

import java.util.Scanner;

public class FlippingImage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = 3;

		int arr[][] = new int[row][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		reversetheArray(arr, row);
		System.out.println("--------------------------------------");
		int arr1[][]=invertArrays(arr, row);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] invertArrays(int[][] arr, int row) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (arr[i][j] == 0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}
		}


		return arr;
	}

	private static void reversetheArray(int[][] arr, int row) {

		for (int i = 0; i < row; i++) {
			int low = 0, high = row - 1;

			while (low < high) {
				int temp = arr[i][low];
				arr[i][low] = arr[i][high];
				arr[i][high] = temp;
				low++;
				high--;
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
