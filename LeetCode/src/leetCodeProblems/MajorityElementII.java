package leetCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {

	public static void main(String[] args) {

		int nums[] = new int[] { 3, 2, 3 };
		findMajorityEle(nums);
	}

	private static void findMajorityEle(int[] nums) {

//		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
//
//		int n = nums.length;
//
//		for (int arr : nums) {
//			map.put(arr, map.getOrDefault(arr, 0) + 1);
//		}
//
//		List<Integer> list = new ArrayList<>();
//		boolean flag = false;
//		for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
//			if (mp.getValue() > n / 3) {
//				list.add(mp.getKey());
//				flag = true;
//			}
//		}
//		if (!flag && n < 3) {
//			for (int arr : nums) {
//				list.add(arr);
//			}
//		}
//		System.out.println(list);

		/*-------------Optimised Solution-----------*/

		List<Integer> list = new ArrayList<>();
		if (nums == null)
			return;
		
		
		int num1 = 0;
		int num2 = 0;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < nums.length; i++) {
			int num3 = nums[i];
			if (count1 > 0 && count2 > 0) {

				if (num3 == num1) {
					count1++;
				} else if (num3 == num2) {
					count2++;
				} else {
					count1--;
					count2--;
				}

			} else if (count1 > 0) {

				if (num3 == num1) {
					count1++;
				} else {
					num2 = num3;
					count2++;
				}

			} else if (count2 > 0) {

				if (num3 == num2) {
					count2++;
				} else {
					num1 = num3;
					count1++;
				}

			} else {
				num1 = num3;
				count1++;
			}
		}

		// now we have the values that appears frequently in the array but it doesnot
		// means that they both are maximum elements .........
		// so we have to iterate again over the array to cehck for maximum element out
		// of both .......

		count1 = 0;
		count2 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == num1) {
				count1++;
			} else if (nums[i] == num2) {
				count2++;
			}
		}
		if (count1 > nums.length / 3) {
			list.add(num1);
		}
		if (count2 > nums.length / 3) {
			list.add(num2);
		}

		System.out.println(list);
	}

}
