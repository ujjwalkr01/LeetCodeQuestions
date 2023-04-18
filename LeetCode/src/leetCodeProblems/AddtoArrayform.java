package leetCodeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class AddtoArrayform {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 0, 0 };
		int k = 34;

		sumAnd_addtoArray(arr, k);
	}

	private static void sumAnd_addtoArray(int[] arr, int k) {

		LinkedList<Integer> res = new LinkedList<>();
		int len = arr.length - 1;
		while (len >= 0 || k > 0) {
			if (len >= 0) {
				k += arr[len--];
			}
			res.addFirst(k % 10);
			k /= 10;
		}
		System.out.println(res);
	}

}
