package leetCodeProblems;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {

	public static void main(String[] args) {

		String pattern = "abba";
		String s = "dog cat cat dog";

		if (checkThePattern(pattern, s)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean checkThePattern(String pattern, String s) {

		HashMap<Character, String> map = new HashMap<>();
		HashMap<String, Character> map1 = new HashMap<>();

		String words[] = s.split(" ");

		if (pattern.length() != words.length) {
			return false;
		}

		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);

			if (map.containsKey(ch)) {
				if (!map.get(ch).equals(words[i])) {
					return false;
				}
			}
			map.put(ch, words[i]);

			if (map1.containsKey(words[i])) {
				if (!map1.get(words[i]).equals(ch)) {
					return false;
				}
			}
			map1.put(words[i], ch);
		}
		
		return true;

	}

}
