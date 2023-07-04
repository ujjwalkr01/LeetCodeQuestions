package leetCodeProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindtheSubset {
	private static final int MOD = 1000000007;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int[] AR = new int[N];

		for (int i = 0; i < N; i++) {
			AR[i] = scanner.nextInt();
		}

		int result = countDistinctSubsets(N, K, AR);
		System.out.println(result);

	}

	private static int countDistinctSubsets(int N, int K, int[] AR) {
		Arrays.sort(AR);
		int[] dp = new int[N + 1];
		dp[0] = 1;

		for (int i = 1; i <= N; i++) {
			dp[i] = (dp[i - 1] * 2) % MOD;

			for (int j = i - 1; j >= 0; j--) {
				if (AR[i - 1] - AR[j] == K) {
					dp[i] = (dp[i] - dp[j] + MOD) % MOD;
					break;
				}
			}
		}

		return dp[N] - 1;
	}

}
