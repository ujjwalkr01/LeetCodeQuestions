package leetCodeProblems;

import java.util.ArrayList;

public class SpiralMatrix2 {

	public static void main(String[] args) {

		int matrix[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		spiralMatrix(matrix);
	}

	private static void spiralMatrix(int[][] matrix) {

		int row = matrix.length, col = matrix[0].length;
		int top = 0, bottom = row - 1, left = 0, right = col - 1;
		ArrayList<Integer> list = new ArrayList<>();

		while (true) {
			leftToRight(list, matrix, left, right, top);
			top++;
			if (top > bottom) {
				break;
			}
			topToBottom(list, matrix, top, bottom, right);
			right--;
			if (left > right) {
				break;
			}
			rightToLeft(list, matrix, right, left, bottom);
			bottom--;
			if (top > bottom) {
				break;
			}
			bottomToTop(list, matrix, bottom, top, left);
			left++;
			if (left > right) {
				break;
			}
		}
		System.out.println(list);
	}

	private static void bottomToTop(ArrayList<Integer> list, int[][] matrix, int start, int end, int left) {

		for (int i = start; i >= end; i--) {
			list.add(matrix[i][left]);
		}
	}

	private static void rightToLeft(ArrayList<Integer> list, int[][] matrix, int start, int end, int bottom) {

		for (int i = start; i >= end; i--) {
			list.add(matrix[bottom][i]);
		}

	}

	private static void topToBottom(ArrayList<Integer> list, int[][] matrix, int start, int end, int right) {

		for (int i = start; i <= end; i++) {
			list.add(matrix[i][right]);
		}

	}

	private static void leftToRight(ArrayList<Integer> list, int[][] matrix, int start, int end, int top) {

		for (int i = start; i <= end; i++) {
			list.add(matrix[top][i]);
		}
	}

}
