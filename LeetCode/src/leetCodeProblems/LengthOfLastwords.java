package leetCodeProblems;

import java.util.Arrays;

public class LengthOfLastwords {

	public static void main(String[] args) {

		String s = "   fly me   to   the moon  ";
		System.out.println(findlastWordlength(s));
	}

	private static int findlastWordlength(String s) {

		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				count++;
			}
			if (s.charAt(i) == ' ' && count > 0) {
				return count;
			}
		}

		return count;

	}

}
