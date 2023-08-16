package BinarySearchQuestions;

public class FindReverse_PoweOfNum {

	public static void main(String[] args) {

		int n = 12;

		int rev = findRev(n);
		System.out.println(rev);
	}

	private static int findRev(int n) {

		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + (n % 10);
			n /= 10;
		}
		return rev;
	}

}
