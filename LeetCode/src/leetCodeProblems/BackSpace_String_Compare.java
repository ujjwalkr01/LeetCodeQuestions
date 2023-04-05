package leetCodeProblems;

import java.util.Scanner;
import java.util.Stack;

public class BackSpace_String_Compare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		if (backSpaceCompare(s, t)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean backSpaceCompare(String s, String t) {

		Stack<Character> st1 = new Stack<>();
		Stack<Character> st2 = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				if (!st1.isEmpty()) {
					st1.pop();
				}
				continue;
			}
			st1.push(s.charAt(i));
		}

		for (int j = 0; j < t.length(); j++) {
			if (t.charAt(j) == '#') {
				if (!st2.isEmpty()) {
					st2.pop();
				}
				continue;
			}
			st2.push(t.charAt(j));
		}

        String res1 = "";
        String res2 = "";
        while(!st1.isEmpty()){
            res1 += st1.pop();
        }
            
        while(!st2.isEmpty()){
            res2 += st2.pop();
        }
           
        return res1.equals(res2);
	}

}
