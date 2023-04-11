package leetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle_II {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no_rows = sc.nextInt();

		List<Integer> list1 = getRow(no_rows);
		System.out.println(list1);
	}

	private static List<Integer> getRow(int no_rows) {

		List<Integer> row = new ArrayList<>();

		for (int i = 0; i < no_rows + 1; i++) {
			row.add(1);
			for (int j = i - 1; j > 0; j--) {
				row.set(j, row.get(j - 1) + row.get(j));
			}
		}

		return row;
	}

}
