package leetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {

		int arr[] = { -3, -2, -1, 0, 0, 1, 2, 3 };
//		int arr[] = { 2, 2, 2, 2 };
		int targ = 0;

		findTargetSumEle(arr, targ);
	}

	private static void findTargetSumEle(int[] arr, int targ) {

		Arrays.sort(arr);

		int n = arr.length;

		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}

			for (int j = i + 1; j < n; j++) {
				if (j != i + 1 && arr[j] == arr[j - 1]) {
					continue;
				}

				int k = j + 1, l = n - 1;

				while (k < l) {
					long sum = arr[i];
					sum += arr[j];
					sum += arr[k];
					sum += arr[l];

					if (sum > targ) {
						l--;
					} else if (sum < targ) {
						k++;
					} else {
						List<Integer> ans = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
						list.add(ans);
						k++;
						l--;

						while (k < l && arr[k] == arr[k - 1]) {
							k++;
						}
						while (k < l && arr[l] == arr[l + 1]) {
							l--;
						}

					}
				}
			}
		}

		System.out.println(list);
	}

}
