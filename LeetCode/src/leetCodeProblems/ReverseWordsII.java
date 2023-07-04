package leetCodeProblems;

public class ReverseWordsII {

	public static void main(String[] args) {

		String s = "i.like.this.program.very.much";

		String str[] = s.split("[.]");

		int i = 0, j = str.length - 1;

		while (i <= j) {
			String temp = str[i];
			str[i] = str[j];
			str[j] = temp;

			i++;
			j--;
		}

		String res = "";
		for (int k = 0; k < str.length; k++) {
			if (k != str.length - 1) {
				res += str[k] + ".";
			} else {
				res += str[k];
			}
		}

		System.out.println(res);

	}

}
