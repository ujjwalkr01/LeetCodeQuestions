package leetCodeProblems;

public class RearrangeArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 4, 0, 2, 1, 3 };
		rearrangeArray(arr);
	}

	private static void rearrangeArray(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] + ((arr[arr[i]] % n) * n);
		}

		for (int i = 0; i < n; i++) {
			arr[i] /= n;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
