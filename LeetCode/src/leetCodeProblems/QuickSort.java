package leetCodeProblems;

public class QuickSort {

	public static void main(String[] args) {

		int arr[] = new int[] { 10, 40, 20, 30 };

		int left = 0, right = arr.length - 1;

		quickSort(arr, left, right);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void quickSort(int[] arr, int left, int right) {

		if (right > left) {
			int pivot = lamutoPart(arr, left, right);
			quickSort(arr, left, pivot - 1);
			quickSort(arr, pivot + 1, right);
		}
	}

	private static int lamutoPart(int[] arr, int left, int right) {

		int pivotindexEle = arr[right];
		int i = left - 1;

		for (int j = left; j < right; j++) {
			if (arr[j] <= pivotindexEle) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, right);
		return i + 1;
	}

	private static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
