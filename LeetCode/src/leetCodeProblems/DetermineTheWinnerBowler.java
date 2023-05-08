package leetCodeProblems;

public class DetermineTheWinnerBowler {

	public static void main(String[] args) {

		int arr[] = new int[] { 1,10,1,1,1 };
		int arr1[] = new int[] { 1,1,10,10,1 };

		System.out.println(findtheWinner(arr, arr1));
	}

	private static int findtheWinner(int[] arr, int[] arr1) {

		int product = 1, sum = 0, count = 0;
		boolean flag = true;
		for (int num : arr) {
			if (product == 2 && count != 2) {
				sum += product * num;
				count++;
			} else {
				product = 1;
				sum += product * num;
			}

			if (num == 10) {
				product = 2;
				count=0;
				flag = false;
			}
		}
		 System.out.println(sum + " " + count);
		int sSum = 0;
		product = 1;
		flag = true;

		for (int num : arr1) {
			if (product == 2 && count != 2) {
				sSum += product * num;
				count++;
			} else {
				product = 1;
				sSum += product * num;
			}

			if (num == 10) {
				product = 2;
				count = 0;
				flag = false;
			}
		}
		System.out.println(sSum);
		if (sum > sSum) {
			return 1;
		} else if (sum < sSum) {
			return 2;
		} else {
			return 0;
		}

	}

}
