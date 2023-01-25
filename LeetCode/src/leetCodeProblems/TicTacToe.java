package leetCodeProblems;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char player1 = sc.next().charAt(0);
		char player2 = sc.next().charAt(0);

		if (player1 == 'R' || player2 == 'R') {
			System.out.println("R");
		} else if (player1 == 'J' || player2 == 'J') {
			if (player1 == 'J')
				System.out.println(player2);
			else
				System.out.println(player1);
		} else {
			System.out.println("D");
		}
	}

}
