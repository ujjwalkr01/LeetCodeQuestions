package leetCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindCommonCharacter {

	public static void main(String[] args) {

		String words[] = new String[] { "bella", "label", "roller" };

		commonCharacter(words);
	}

	private static void commonCharacter(String[] words) {

		List<String> list = new ArrayList<>();

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < words[0].length(); i++) {
			map.put(words[0].charAt(i), map.getOrDefault(words[0].charAt(i), 0) + 1);
		}
		// System.out.println(map);

		for (int i = 1; i < words.length; i++) {
			HashMap<Character, Integer> temp = new HashMap<>();
			for (int j = 0; j < words[i].length(); j++) {
				if (map.containsKey(words[i].charAt(j))) {
					temp.put(words[i].charAt(j),
							Math.min(map.get(words[i].charAt(j)), temp.getOrDefault(words[i].charAt(j), 0) + 1));
				}
			}
			map = temp;
			//System.out.println(map);
		}

		for (char c : map.keySet()) {
			for (int i = 0; i < map.get(c); i++) {
				list.add(c + " ");
			}
		}
		System.out.println(list);
	}

}
