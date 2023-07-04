package leetCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;

public class FindThePair {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 12;

		findSumPairs(arr, target);
	}

	private static void findSumPairs(int[] arr, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		int firstel = 0, secel = 0;

		for (int i = 0; i < arr.length; i++) {
			map.put(i, arr[i]);
		}

		for (int i = 0; i < arr.length/2; i++) {
			if (map.containsValue(target - arr[i])) {
				firstel = arr[i];
				secel = target - arr[i];
				System.out.println(firstel+" "+secel);
			}
          
		}
		

	}

}
