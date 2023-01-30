package leetCodeProblems;

import java.util.Scanner;

public class BuySellstock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int profit = findMaxProfit(nums, n);
		System.out.println(profit);
		int Optimisedmethod = maxProfit(nums, n);
		System.out.println(Optimisedmethod);

	}

	private static int findMaxProfit(int[] arr, int n) {
		int rightMax[] = new int[n];
		rightMax[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--)
			rightMax[i] = Math.max(arr[i], rightMax[i + 1]);

		int leftMin[] = new int[n];
		leftMin[0] = arr[0];
		for (int i = 1; i < n; i++)
			leftMin[i] = Math.min(arr[i], leftMin[i - 1]);

		int res[] = new int[n];
		for (int i = 0; i < n; i++) {
			res[i] = rightMax[i] - leftMin[i];
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, res[i]);
		}
		return max;

	}

	public static int maxProfit(int[] prices, int n) {

		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else if (prices[i] - minPrice > maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
		}
		return maxProfit;
	}

}
