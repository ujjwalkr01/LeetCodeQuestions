package leetCodeProblems;

public class ConsecutiveOnes {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 1, 0, 1, 1, 1 };
		System.out.println(find_maxConsOne(arr));
	}

	private static int find_maxConsOne(int[] arr) {

		int count = 0, res = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			} else {
				res = Math.max(count, res);
				count = 0;
			}
		}
		if (res < count) {
			return count;
		}

		return res;
	}

}
