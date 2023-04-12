package leetCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class LargestPositiveNo_Existnegative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(findMaxK(arr));
	}

	private static int findMaxK(int[] nums) {
		
		Arrays.sort(nums);

		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			if (nums[start] > 0) {
				return -1;
			} else if (Math.abs(nums[start]) < nums[end]) {
				end--;
			} else if (Math.abs(nums[start]) > nums[end]) {
				start++;
			} else {
				return nums[end];
			}
		}

		return -1;
		
		
		//Another approach
		
		  //   HashSet<Integer> set=new HashSet<>();
	    //   Arrays.sort(nums);
	    //   for(int i=0;i<nums.length;i++){
	    //       if(nums[i]<0){
	    //          set.add(nums[i]);
	    //       }else{
	    //           break;
	    //       }          
	    //   }   
	    //    int n=nums.length;
	    //   for(int i=n-1;i>=0;i--){
	    //       if(set.contains(-nums[i])){
	    //           return nums[i];
	    //       }
	    //   }  
	    //   return -1;
	}

}
