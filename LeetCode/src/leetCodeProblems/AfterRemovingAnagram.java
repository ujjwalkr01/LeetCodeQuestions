package leetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class AfterRemovingAnagram {

	static final int CHAR = 256;

	public static void main(String[] args) {

		String words[] = new String[] { "abba", "baba", "bbaa", "abab", "cd", "cd" };

		removeAnagram(words);
	}

	private static void removeAnagram(String[] words) {

		List<String> list = new ArrayList();
//
//		for (String word : words) {
//			list.add(word);
//		}
//		for (int i = 1; i < words.length; i++) {
//			if (checkEquals(words[i - 1], words[i])) {
//				list.remove(words[i]);
//			}
//		}
 //alternate approach
		String prev = "";
		for (int i = 0; i < words.length; i++) {
			char[] ch = words[i].toCharArray();
			Arrays.sort(ch);
			String curr = String.valueOf(ch);
			if (!curr.equals(prev)) {
				list.add(words[i]);
				prev = curr;
			}
		}

		System.out.println(list);
	}

	private static boolean checkEquals(String str1, String str2) {
//
//		char c[] = str1.toCharArray();
//		Arrays.sort(c);
//
//		char c1[] = str2.toCharArray();
//		Arrays.sort(c1);
//
//		return Arrays.equals(c, c1) ? true : false;

		if (str1.length() != str2.length())
			return false;

		int count[] = new int[CHAR];

		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		for (int i = 0; i < CHAR; i++) {
			if (count[i] != 0)
				return false;
		}
		return true;

	}

}
