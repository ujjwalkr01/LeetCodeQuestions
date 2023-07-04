package leetCodeProblems;

public class LicencseFormatting {

	public static void main(String[] args) {

		String s = "2-5g-3-J";
		int k = 2;

		System.out.println(formatString(s, k));
	}

	private static String formatString(String s, int k) {

//		String res = "", bag = "";
//		s = s.toUpperCase();
//		int count = 0;
//
//		for (int i = s.length() - 1; i >= 0; i--) {
//			if (s.charAt(i) != '-') {
//				if (count == k) {
//					bag += '-';
//					count = 0;
//				}
//				bag += s.charAt(i);
//				count++;
//			}
//		}
//		System.out.println(bag);
//
//		for (int i = bag.length() - 1; i >= 0; i--) {
//			res += bag.charAt(i);
//		}
//
//		System.out.println(res);

		/*----optimised solution----*/
		StringBuilder sb = new StringBuilder();

		for (int i = s.length() - 1, count = 0; i >= 0; --i) {

			char c = s.charAt(i);
			if (c == '-')
				continue;

			// put a '-' first if we already append K characters
			if (count == k) {
				sb.append('-');
				count = 0;
			}

			sb.append(Character.toUpperCase(c));
			++count;
		}

		return sb.reverse().toString();

	}

}
