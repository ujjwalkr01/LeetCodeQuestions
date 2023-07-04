package leetCodeProblems;

public class SquareOfSortedArray {

	public static void main(String[] args) {

		int arr[] = new int[] { -4, -1, 0, 3, 10 };

		int res[] = findtheSquareInIncreasingOrder(arr);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

	private static int[] findtheSquareInIncreasingOrder(int[] arr) {

		int res[] = new int[arr.length];

		int i = 0, j = arr.length - 1, k = j;

		while (i < j) {
			if (Math.abs(arr[i]) < Math.abs(arr[j])) {
				res[k--] = arr[j] * arr[j];
				j--;
			} else if (Math.abs(arr[i]) > Math.abs(arr[j])) {
				res[k--] = arr[i] * arr[i];
				i++;
			} else {
				res[k--] = arr[i] * arr[i];
				i++;
				res[k--] = arr[j] * arr[j];
				j--;
			}
		}
		if (i == j && k >= 0) {
			res[k] = arr[i]*arr[i];
		}
		return res;
	}

}
