package leetCodeProblems;

import java.util.ArrayList;

public class SpiralMatrix {

	public static void main(String[] args) {

		int n = 3;
		int matrix[][] = new int[n][n];

		spiralMatrix(matrix, n);
	}

	private static void spiralMatrix(int[][] matrix, int n) {

		int row = matrix.length, col = matrix[0].length;
		int top = 0, bottom = row - 1, left = 0, right = col - 1;
		int res[][] = new int[n][n];
		int k = 1;
		while (true) {
			int count = leftToRight(matrix, left, right, top, k);
			top++;
			if (top > bottom) {
				break;
			}
			//System.out.println(count);
			int count1 = topToBottom(matrix, top, bottom, right, count);
			right--;
			if (left > right) {
				break;
			}
			int count2 = rightToLeft(matrix, right, left, bottom, count1);
			bottom--;
			if (top > bottom) {
				break;
			}
			int count3 = bottomToTop(matrix, bottom, top, left, count2);
			left++;
			if (left > right) {
				break;
			}
			k = count3;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
	}

	private static int bottomToTop(int[][] matrix, int start, int end, int left, int k) {

		for (int i = start; i >= end; i--) {
			matrix[i][left] = k++;
		}
		return k;
	}

	private static int rightToLeft(int[][] matrix, int start, int end, int bottom, int k) {

		for (int i = start; i >= end; i--) {
			matrix[bottom][i] = k++;
		}
		return k;

	}

	private static int topToBottom(int[][] matrix, int start, int end, int right, int k) {

		for (int i = start; i <= end; i++) {
			matrix[i][right] = k++;
			// System.out.println("k value="+k);
		}
		return k;

	}

	private static int leftToRight(int[][] matrix, int start, int end, int top, int k) {

		for (int i = start; i <= end; i++) {
//			System.out.println("k value="+k);
			matrix[top][i] = k++;

		}
		return k;
	}

}
