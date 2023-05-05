package leetCodeProblems;

public class MaxNoOfVowelsInSubstring {

	public static void main(String[] args) {

		String s = "leetcode";
		int k = 3;
		findtheMaxVowels(s, k);
	}

	private static void findtheMaxVowels(String s, int k) {

		char c[] = s.toCharArray();
		int count = 0, max = Integer.MIN_VALUE;

		for (int i = 0; i <= c.length - k; i++) {
			int start = i;
			count = 0;
			while (start < k + i) {
				if (c[start] == 'a' || c[start] == 'e' || c[start] == 'i' || c[start] == 'o' || c[start] == 'u') {
					count++;
//    				System.out.println(count);
				}
				start++;
			}

			max = Math.max(max, count);
		}
		System.out.println(max);

	}

}
