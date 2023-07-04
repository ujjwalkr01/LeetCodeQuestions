package leetCodeProblems;

public class LongestSubstringLength {

	public static void main(String[] args) {

		String s = "pwwkew";
		System.out.println(findtheMaxLength(s));
	}

	private static int findtheMaxLength(String s) {

		int max = Integer.MIN_VALUE, count = 1;
        String bag="";
		for (int i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i) == s.charAt(i + 1)) {
				max = Math.max(max, count);
				count=1;
			} else {
				count++;
			}

		}
//		System.out.println(bag);
		return max;

	}

}
