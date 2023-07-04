package leetCodeProblems;

public class ReverseWords {

	public static void main(String[] args) {

		String s = "a good   example";
		reverseWord(s);
	}

	private static void reverseWord(String s) {

		String str[] = s.split(" ");
//		for(int i=0;i<str.length;i++) {
//			System.out.println(str[i]);
//		}
		int low = 0, high = str.length - 1;

		while (low <= high) {
			String temp = str[low];
			str[low] = str[high];
			str[high] = temp;
			low++;
			high--;
		}
		String revbag = "";
		for (int i = 0; i < str.length; i++) {
			revbag += str[i] + " ";
//			System.out.print(str[i] + " ");
		}
//		System.out.println();
		System.out.println(revbag.replaceAll("\\s+"," ").trim());

	}

}
