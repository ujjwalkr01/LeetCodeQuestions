package leetCodeProblems;

import java.util.Arrays;

public class Candy {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 87, 87, 87, 2, 1 };
		System.out.println(findthemaxCandy(arr));
	}

	private static int findthemaxCandy(int[] ratings) {

		int sum = ratings.length;
		int count[] = new int[ratings.length];
		Arrays.fill(count, 0);

		for (int i = 0; i < ratings.length - 1; i++) {

			if (ratings[i] < ratings[i + 1]) {
				count[i + 1] = count[i] + 1;
			}
		}
		for (int i = ratings.length - 1; i > 0; i--) {
			if (ratings[i] < ratings[i - 1]) {
				if (count[i - 1] < (count[i] + 1)) {
					count[i - 1] = count[i] + 1;
				}
			}

		}
		for (int i = 0; i < count.length; i++) {
			sum += count[i];
			// System.out.print(count[i] + " ");
		}
		// System.out.println("sum="+sum);
		return sum;
	}

}
