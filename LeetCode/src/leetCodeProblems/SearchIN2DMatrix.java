package leetCodeProblems;

public class SearchIN2DMatrix {

	public static void main(String[] args) {

		int arr[][] = new int[][] { { 1, 13, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int x = 3;
		if (findTheElement(arr, x)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean findTheElement(int[][] arr, int x) {

		int row = arr.length, col = arr[0].length;
		int i = 0, j = col - 1;

		while (i < row && j >= 0) {
			if (arr[i][j] == x) {
				return true;
			} else if (arr[i][j] > x) {
				j--;
			} else {
				i++;
			}
		}
		return false;
		
		//BinarySearch Solution
		
		
	}

}
