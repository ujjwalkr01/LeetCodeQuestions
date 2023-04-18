package leetCodeProblems;

import java.util.HashMap;

public class NoOFGoodPairs {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 1, 1, 3 };
		System.out.println(numIdenticalPairs(arr));
	}

	public static int numIdenticalPairs(int[] nums) {
		// int count=0;
		// for(int i=0;i<nums.length;i++){
		// for(int j=0;j<nums.length;j++){
		// if(i<j && nums[i]==nums[j]){
		// count++;
		// }
		// }
		// }
		HashMap<Integer, Integer> map = new HashMap<>();

		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = map.getOrDefault(nums[i], 0);
			res += count;
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		return res;
	}

}
