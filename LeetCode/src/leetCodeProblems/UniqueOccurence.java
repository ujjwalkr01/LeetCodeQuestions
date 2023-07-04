package leetCodeProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;

public class UniqueOccurence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		if (uniqueOccurrences(arr)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean uniqueOccurrences(int[] arr) {
		
		HashMap<Integer, Integer> mp = new HashMap<>();

		HashSet<Integer> set = new HashSet<>();

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
		}
		// System.out.print(mp);

		for (Entry<Integer, Integer> map : mp.entrySet()) {
			if (!set.contains(map.getValue())) {
				set.add(map.getValue());
			} else {
				return false;
			}

		}

		// System.out.print(set);
		return true;
	}

}
