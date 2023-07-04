package leetCodeProblems;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		System.out.println(reverseNumber(x));
	}

	private static int reverseNumber(int x) {

		long rev = 0;
		int a = Integer.MAX_VALUE, b = Integer.MIN_VALUE;
		int num = x;
		while (num != 0) {
			long rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		// System.out.print(rev);
		if (rev > a || rev < b) {
			return 0;
		} else {
			return (int) rev;
		}
	}

}
