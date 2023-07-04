package leetCodeProblems;

import java.util.HashSet;
import java.util.Scanner;

public class MakeArrayZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] { 1, 5, 0, 3, 5 };

		System.out.println(makeArrayZero(arr));
	}

	private static int makeArrayZero(int[] arr) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				set.add(arr[i]);
			}
		}
		return set.size();
	}

}
