package leetCodeProblems;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 3, m = 2;

		int matrix[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		transposeMatrix(matrix, n, m);
	}

	private static void transposeMatrix(int[][] matrix, int n, int m) {

		int arr[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				arr[i][j] = matrix[j][i];
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
