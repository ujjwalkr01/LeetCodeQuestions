package leetCodeProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class CountFreq {

	public static void main(String[] args) {

		int arr[] = new int[] { 3, 4, 5, 7, 8, 1, 2, 1, 3 };

		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		// System.out.println(max);
		int count[] = new int[max + 1];

		for (int i = 0; i < count.length; i++) {
			count[arr[i]]++;
		}
		boolean isRepeated = false;
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 2) {
				System.out.println(i + " ");
				isRepeated = true;
			}
		}
		if (isRepeated == false) {
			System.out.println("-1");
		}
		System.out.println("____________________________________");
		countFreq(arr);
	}

	public static void countFreq(int arr[]) {
		TreeSet<Integer> set = new TreeSet<>();
		HashSet<Integer> unique = new HashSet<>();

		for (int num : arr) {
			if (unique.contains(num)) {
				set.add(num);
			} else {
				unique.add(num);
			}
		}
		
		for(int i=0;i<set.size();i++) {
			//System.out.println(set.);
		}
		System.out.println(set);

	}

}
