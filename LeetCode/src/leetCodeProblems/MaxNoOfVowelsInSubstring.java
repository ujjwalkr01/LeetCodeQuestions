package leetCodeProblems;

public class MaxNoOfVowelsInSubstring {

	public static void main(String[] args) {

		String s = "leetcode";
		int k = 3;
		findtheMaxVowels(s, k);
	}

	private static void findtheMaxVowels(String s, int k) {

		int vowel = 0;
		for (int i = 0; i < k; i++)
			if (isVowel(s.charAt(i)))
				vowel++;
		int max = vowel;
		for (int i = k; i < s.length(); i++) {
			if (isVowel(s.charAt(i)))
				vowel++;
			if (isVowel(s.charAt(i - k)))
				vowel--;
			max = Math.max(max, vowel);
		}

	}

	private static boolean isVowel(char c) {
		if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'))
			return true;
		return false;
	}

}
