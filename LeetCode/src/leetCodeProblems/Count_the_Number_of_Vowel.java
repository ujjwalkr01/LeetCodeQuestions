package leetCodeProblems;

import java.util.Scanner;

public class Count_the_Number_of_Vowel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String words[] = new String[] { "are", "amy", "u" };
		int left = sc.nextInt();
		int right = sc.nextInt();

		System.out.println(vowelStrings(words, left, right));
	}

	private static int vowelStrings(String[] words, int left, int right) {

		int count = 0;
		for (int i = left; i <= right; i++) {

			char c = words[i].charAt(0);
			char d = words[i].charAt(words[i].length() - 1);

			if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					&& (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u')) {
				count++;
				// System.out.println(words[i]);
			}
		}

		return count;
	}

}
