package leetCodeProblems;

import java.time.chrono.MinguoDate;

public class Sortings {

	public static void main(String[] args) {

		int arr[] = new int[] { 10, 50, 30, 20, 40 };
		bubbleSort(arr);

		System.out.println();

		int arr1[] = new int[] { 10, 50, 70, 20, 40 };
		selectionSort(arr1);

		System.out.println();

		int arr2[] = new int[] { 10, 50, 80, 20, 40 };
		InsertionSort(arr2);

		System.out.println();

		int arr3[] = new int[] { 10, 50, 90, 20, 40 };
		int l = 0, r = arr.length - 1;
		mergeSort(arr3, l, r);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

		
		System.out.println();

		int arr4[] = new int[] { 10, 95, 90, 20, 40 };
		int left = 0, right = arr4.length - 1;
		mergeSort(arr4, left, right);
	}

	private static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void selectionSort(int[] arr1) {

		for (int i = 0; i < arr1.length; i++) {
			int minIndex = i, j = i + 1;
			while (j < arr1.length) {
				if (arr1[minIndex] > arr1[j]) {
					minIndex = j;
				}
				j++;
			}
			int temp = arr1[i];
			arr1[i] = arr1[minIndex];
			arr1[minIndex] = temp;
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	private static void InsertionSort(int[] arr2) {

		for (int i = 1; i < arr2.length; i++) {
			int currEle = arr2[i];
			int j = i - 1;

			while (j >= 0 && currEle < arr2[j]) {
				arr2[j + 1] = arr2[j];
				j--;
			}
			arr2[j + 1] = currEle;
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

	private static void mergeSort(int[] arr3, int left, int right) {

		if (right > left) {

			int mid = left + (right - left) / 2;

			mergeSort(arr3, left, mid);
			mergeSort(arr3, mid + 1, right);
			merge(arr3, left, mid, right);
		}

	}

	private static void merge(int[] arr3, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		int l[] = new int[n1];
		int r[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			l[i] = arr3[i + left];
		}

		for (int i = 0; i < n2; i++) {
			r[i] = arr3[mid + 1 + i];
		}

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {
			if (l[i] < r[j]) {
				arr3[k++] = l[i++];
			} else {
				arr3[k++] = r[j++];
			}
		}

		while (i < n1) {
			arr3[k++] = l[i++];
		}

		while (j < n2) {
			arr3[k++] = r[j++];
		}
	}

}
