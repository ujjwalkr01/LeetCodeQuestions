package leetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagaram {

	public static void main(String[] args) {

		String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

		grouptheAnagram(str);
	}

	private static void grouptheAnagram(String[] str) {

		Map<String, List<String>> mp = new HashMap<>();

		List<List<String>> list =new ArrayList<>();
		for (String s : str) {
			char ch[] = s.toCharArray();
			Arrays.sort(ch);
			// System.out.print(ch);
			String sortedStr = String.valueOf(ch);
			// System.out.println(sortedStr);
			if (!mp.containsKey(sortedStr)) {
				mp.put(sortedStr, new ArrayList<>());
			}
			mp.get(sortedStr).add(s);
		}
		//System.out.println(mp);
//		new ArrayList<>(mp.values());
		System.out.println(mp.values());
		list.addAll(mp.values());
		System.out.println(list);
	}

}
