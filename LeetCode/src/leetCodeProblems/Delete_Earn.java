package leetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Delete_Earn {

	public static void main(String[] args) {

		int arr[] = new int[] {3,4,2 };

		System.out.println(maximizeOperation(arr));
	}

	private static int maximizeOperation(int[] nums) {

		int[] sum = new int[10002];

		for (int i = 0; i < nums.length; i++) {
			sum[nums[i]] += nums[i];
		}

		for (int i = 2; i < sum.length; i++) {
			sum[i] = Math.max(sum[i - 1], sum[i - 2] + sum[i]);
			//System.out.println(sum[i]);
		}
		//System.out.println(sum[10001]);
		return sum[10001];

	}

}
