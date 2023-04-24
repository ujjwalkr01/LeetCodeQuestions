package leetCodeProblems;

public class DivideArrayIntoEquals {

	public static void main(String[] args) {

		int arr[] = new int[] { 3, 2, 3, 2, 2, 2 };

		if (divideArray(arr)) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean divideArray(int[] nums) {
		int[] n = new int[501];
		for (int i = 0; i < nums.length; i++) {
			n[nums[i]]++;
		}
		for (int i = 0; i < 501; i++) {
			if (n[i] % 2 == 1)
				return false;
		}
		return true;

	}

}
