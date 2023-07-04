package leetCodeProblems;

public class DetermineTheWinnerBowler {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 10, 1, 1, 1 };
		int arr1[] = new int[] { 1, 1, 10, 10, 1 };

		System.out.println(findtheWinner(arr, arr1));
	}

	private static int findtheWinner(int[] player1, int[] player2) {

		int p1 = 0, p2 = 0;
		for (int i = 0; i < player1.length; i++) {
			if ((i == 1 && player1[i - 1] == 10) || (i >= 2 && (player1[i - 1] == 10 || player1[i - 2] == 10))) {
				p1 += player1[i];
			}
			if ((i == 1 && player2[i - 1] == 10) || (i >= 2 && (player2[i - 1] == 10 || player2[i - 2] == 10))) {
				p2 += player2[i];
			}
			p1 += player1[i];
			p2 += player2[i];
		}
		return p1 == p2 ? 0 : p1 > p2 ? 1 : 2;
	}

}
