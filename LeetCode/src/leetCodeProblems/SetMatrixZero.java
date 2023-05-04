package leetCodeProblems;

public class SetMatrixZero {

	public static void main(String[] args) {

		int arr[][] = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		makeMatrixZero(arr);
	}

	private static void makeMatrixZero(int[][] matrix) {

		int m = matrix.length, n = matrix[0].length;
		boolean isRow0 = false, isCol0 = false;

		for (int j = 0; j < n; j++) {
			if (matrix[0][j] == 0)
				isRow0 = true;
		}

		for (int i = 0; i < m; i++) {
			if (matrix[i][0] == 0)
				isCol0 = true;
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (matrix[0][j] == 0 || matrix[i][0] == 0)
					matrix[i][j] = 0;
			}
		}

		if (isRow0) {
			for (int j = 0; j < n; j++)
				matrix[0][j] = 0;
		}

		if (isCol0) {
			for (int i = 0; i < m; i++)
				matrix[i][0] = 0;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
