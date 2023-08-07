package leetCodeProblems;

import java.util.HashMap;
import java.util.Scanner;

public class FindTheTargetElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();

		if (FindTarget(arr, n, num)) {
			System.out.println("Yes valid sum pair found for the num");
		} else {
			System.out.println("No valid sum pair found for the num");
		}
	}

	private static boolean FindTarget(int[] arr, int n, int num) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			map.put(arr[i], i);
		}

		System.out.println(map);
		int firstNum = -1, secNum = -1;
		for (int i = 0; i < n; i++) {
			if (map.containsKey(num - arr[i])) {
				secNum = firstNum;
				firstNum = arr[i];
			}
		}
		System.out.println(firstNum + " " + secNum);
		return (firstNum != -1 && secNum != -1) ? true : false;
	}

}
