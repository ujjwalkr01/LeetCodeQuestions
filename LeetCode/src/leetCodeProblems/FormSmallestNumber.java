package leetCodeProblems;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class FormSmallestNumber {

	public static void main(String[] args) {

		int arr[] = new int[] {7,5,6};
		int arr1[] = new int[] { 1, 4 };

		System.out.println(formAsmallestDigitNumber(arr, arr1));
	}

	private static int formAsmallestDigitNumber(int[] arr, int[] arr1) {

		TreeMap<Integer, Integer> map = new TreeMap<>();
		int min = Integer.MAX_VALUE;
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
			if (min > num) {
				min = num;
			}
		}

		int sMin = Integer.MAX_VALUE;

		for (int num : arr1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
			if (sMin > num) {
				sMin = num;
			}
		}

		int res = 0;
		if (min < sMin) {
			res = min * 10 + sMin;
		} else {
			res = sMin * 10 + min;
		}

		for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
			if (mp.getValue() == 2) {
				return mp.getKey();
			}
		}
		return res;

	}

}
