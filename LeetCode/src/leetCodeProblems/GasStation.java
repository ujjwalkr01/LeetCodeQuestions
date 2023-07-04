package leetCodeProblems;

public class GasStation {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		int arr1[] = new int[] { 3, 4, 5, 1, 2 };

		System.out.println(canCompleteCircuit(arr, arr1));
	}

	private static int canCompleteCircuit(int[] gas, int[] cost) {

		int tank = 0;
		for (int i = 0; i < gas.length; i++)
			tank += gas[i] - cost[i];
		
		System.out.println(tank);
		if (tank < 0)
			return -1;

		int start = 0;
		int accumulate = 0;
		for (int i = 0; i < gas.length; i++) {
			int curGain = gas[i] - cost[i];
			if (accumulate + curGain < 0) {
				start = i + 1;
				accumulate = 0;
			} else
				accumulate += curGain;
		}

		return start;
	}

}
