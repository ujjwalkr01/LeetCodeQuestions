package leetCodeProblems;

import java.util.Scanner;
import java.util.Stack;

public class CheckDuplicateParenthesis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String s = "((x+y)+((z)))";
		String s = "((x+y))+z)";

		if (findthedupParenthesis(s)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean findthedupParenthesis(String s) {

		Stack<Character> st = new Stack<>();

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				st.push(s.charAt(i));
			} else {
				if (!st.isEmpty() && (s.charAt(i) == ')')) {
					count++;
					if (count >= 2) {
						return true;
					}
				} else {
					count = 0;
				}
			}
		}
//		System.out.println(count);
//		System.out.println(st);
		return false;
	}

}
