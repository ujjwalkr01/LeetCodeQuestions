package leetCodeProblems;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class KthDistinctString {

	public static void main(String[] args) {

		String arr[] = new String[] { "aaa", "aa", "a" };
		int k = 1;

		System.out.println(findKthDistinctString(arr, k));
	}

	private static String findKthDistinctString(String[] arr, int k) {

		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		for (String word : arr) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		System.out.println(map);

		String res = "";
		int count = 0;
		for (String word : arr) {
			if (map.get(word) == 1) {
				res = word;
				count++;
				if (count == k) {
					return res;
				}
			}
		}
		return  "";
	}

}
