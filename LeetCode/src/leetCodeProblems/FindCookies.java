package leetCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class FindCookies {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nums[] = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int nums1[] = new int[m];

		for (int i = 0; i < m; i++) {
			nums1[i] = sc.nextInt();
		}
		findGreddy(nums, n, nums1, m);
	}

	private static void findGreddy(int[] g, int n, int s[], int m) {

		Arrays.sort(g);
		Arrays.sort(s);

		int i = 0;
		for (int j = 0; i < g.length && j < s.length; j++) {
			if (g[i] <= s[j]) {
				i++;
			}
		}
		System.out.println(i);
	}

}
