package leetCodeProblems;

import java.util.Scanner;

public class IslandPerimeter {

	public static void main(String[] args) {

		int arr[][] = new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
//		int arr[][] = { { 1, 0 } };

		System.out.println(findIslandPerimeter(arr));
	}

	private static int findIslandPerimeter(int[][] grid) {

		int peri = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					peri += 4;

					if (i > 0 && grid[i - 1][j] == 1) {
						peri += -1;
					}
					if (j > 0 && grid[i][j - 1] == 1) {
						peri += -1;
					}
					if (i < grid.length - 1 && grid[i + 1][j] == 1) {
						peri += -1;
					}
					if (j < grid[0].length - 1 && grid[i][j + 1] == 1) {
						peri += -1;
					}

				}
			}

		}
		return peri;
	}
}
