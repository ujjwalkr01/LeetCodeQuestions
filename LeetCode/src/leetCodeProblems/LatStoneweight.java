package leetCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class LatStoneweight {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findLastStoneWeight(arr, n));
	}

	private static int findLastStoneWeight(int[] stones, int n) {

		if (n == 1) {
			return stones[0];
		}

		Arrays.sort(stones);

		int res = stones[n - 1] - stones[n - 2];
		int diff = 0;

		if (n > 3) {
			for (int i = n - 3; i > 0; i--) {
				if(stones[i]!=stones[i-1]) {
				if (res < stones[i] && res >= stones[i - 1]) {
					res = stones[i] - res;
				} else {
					diff = stones[i] - stones[i - 1];
					// System.out.println("hi"+diff);
					res = Math.abs(diff - res);
					// System.out.println(res);
					// i--;
				}
			}
		  }		
		}

		return res;
	}

}
