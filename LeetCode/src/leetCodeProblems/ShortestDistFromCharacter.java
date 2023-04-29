package leetCodeProblems;

import java.beans.IndexedPropertyDescriptor;
import java.util.HashMap;

public class ShortestDistFromCharacter {

	public static void main(String[] args) {

		String s = "loveleetcode";
		char c = 'e';

		findshortestDist(s, c);
	}

	private static void findshortestDist(String s, char c) {

		int res[] = new int[s.length()];

		int k = s.indexOf(c);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				k = i;
				res[i] = Math.abs(k - i);
			} else {
				res[i] = Math.abs(k - i);
			}
		}

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == c) {
				k = i;
				res[i] = Math.min(res[i], Math.abs(k - i));
			} else {
				res[i] = Math.min(res[i], Math.abs(k - i));
			}
		}

//		for (int i = 0; i < s.length(); i++) {
//			if (larr[i] < res[i]) {
//				res[i] = larr[i];
//			}
//		}

		System.out.println();
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
//        return res;

	}

}
