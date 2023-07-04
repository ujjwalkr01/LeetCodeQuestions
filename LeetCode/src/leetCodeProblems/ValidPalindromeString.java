package leetCodeProblems;

public class ValidPalindromeString {

	public static void main(String[] args) {

		String s = "0P";
		if (checkPalindrome(s)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean checkPalindrome(String s) {

		s = s.toLowerCase();
//		String bag = "", rev = "";
//
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//
//			if (Character.isAlphabetic(c) || Character.isDigit(c)) {
//				bag += c;
//			}
//		}
//		for (int i = bag.length() - 1; i >= 0; i--) {
//			rev += bag.charAt(i);
//		}
//
//		System.out.println(bag);
//		 System.out.println(rev);
//		if (rev.equals(bag)) {
//			return true;
//		}
//		 
//
//		return false;

		int last = s.length() - 1, first = 0;

		while (first <= last) {
			char firstC = s.charAt(first);
			char lastC = s.charAt(last);

			if (!Character.isLetterOrDigit(firstC)) {
				first++;
			} else if (!Character.isLetterOrDigit(lastC)) {
				last--;
			} else {
				if (firstC != lastC) {
					return false;
				}
				first++;
				last--;
			}
			
		}
		return true;

	}

}
