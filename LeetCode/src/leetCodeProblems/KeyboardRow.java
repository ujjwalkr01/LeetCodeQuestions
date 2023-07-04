package leetCodeProblems;

import java.util.ArrayList;

public class KeyboardRow {

	public static void main(String[] args) {

		String[] words = new String[] { "Hello", "Alaska", "Dad", "Peace" };

		findWords(words);
	}

	private static void findWords(String[] words) {

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {
			String s = words[i].toLowerCase();
			if (s.matches("^[qwertyuiop]*$") || s.matches("^[asdfghjkl]*$") || s.matches("^[zxcvbnm]*$")) {
				list.add(words[i]);
			}
		}

		String res[] = new String[list.size()];
		res = list.toArray(res);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
