package leetCodeProblems;

public class RowWithMaxNoOfOnes {

	public static void main(String[] args) {

		int arr[][] = new int[][] { { 0, 0 }, { 1, 1 },{1,0} };

		findMaxOnesinRow(arr);
	}

	private static void findMaxOnesinRow(int[][] arr) {

		int maxCount = 0, ind = 0;

		int res[] = new int[2];

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 1) {
					count++;
				}
			}
			if (maxCount < count) {
				maxCount = count;
				ind = i;
			}
		}
		res[0] = ind;
		res[1] = maxCount;

		System.out.println(res[0] + " " + res[1]);

	}

}
