package leetCodeProblems;

public class HappyNumber {

	public static void main(String[] args) {

		int n = 19;

		if (happyNumber(n)) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean happyNumber(int n) {

		if (n == 1 || n == 7 || n == 10) {
			return true;
		}
		if (n < 10 && (n != 1 || n != 7)) {
			return false;
		}

		int sum = n, num = 0;

		while (true) {
			num = sum;
			sum = 0;
			while (num != 0) {
				sum += (int) Math.pow((num % 10), 2);
				num /= 10;
			}
			if (sum == 1 || sum == 7 || sum == 10) {
				return true;
			}else {
				return false;
			}
		}
		
	}

}
