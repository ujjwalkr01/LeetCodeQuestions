package leetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PascalsTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no_rows = sc.nextInt();

		generateThepascalTriang(no_rows);
	}

	private static void generateThepascalTriang(int no_rows) {


		List<List<Integer>> list = new ArrayList();

		for (int i = 1; i <= no_rows; i++) {
			ArrayList<Integer> row = new ArrayList<>();

			for (int j = 0; j < i; j++) {
				if (j == 0 || j == i - 1) {
					row.add(1);
				} else {
					row.add(list.get(i - 2).get(j) + list.get(i - 2).get(j - 1));
				}
			}
			list.add(row);
		}
		
		System.out.println(list);

	}

}
