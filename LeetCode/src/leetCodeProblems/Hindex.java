package leetCodeProblems;

public class Hindex {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 3, 1 };

		System.out.println(findH_index(arr));

	}

	private static int findH_index(int[] arr) {

		int n = arr.length;
		int quantity[] = new int[n + 1];

		for (int quality : arr) {
			if (quality >= n) {
				quantity[n]++;
			} else {
				quantity[quality]++;
			}
		}

		int sum = 0;
		for (int i = quantity.length - 1; i >= 0; i--) {
			sum += quantity[i];
			if (sum >= i) {
				return i;
			}
		}
		return 0;
	}

}
