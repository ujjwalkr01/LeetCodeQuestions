package leetCodeProblems;

import java.util.Scanner;

public class CountDistinctNumOnBoard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int res = distinctInteger(n);
		System.out.println(res);
		System.out.println("--------------------------");

		System.out.println(alternateMethod(n));
	}

	private static int alternateMethod(int n) {

		if (n > 1) {
			return n-1;
		} 
		return 1;
	}

	private static int distinctInteger(int n) {

		int count = 1;
		int i = 1, j = n;

		while (i <= j) {
			if (i == j) {
				if (n % j == 1) {
					count++;
					break;
				}
			}
			if (n % i == 1) {
				count++;
				i++;
			}
			if (n % j == 1) {
				count++;
				n = j;

			}
			// i++;
			j--;
		}
		return count;
	}

}
