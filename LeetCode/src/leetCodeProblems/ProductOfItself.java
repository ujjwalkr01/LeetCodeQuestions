package leetCodeProblems;

import java.util.Arrays;

public class ProductOfItself {

	public static void main(String[] args) {

		int arr[] = new int[] { -1,1,0,-3,3 };
		findtheProduct(arr);
	}

	private static void findtheProduct(int[] arr) {

		int res[] = new int[arr.length];

		Arrays.fill(res, 1);
		int curr=1;
		
		for(int i=0;i<arr.length;i++) {
			res[i]*=curr;
			curr*=arr[i];
		}

//		for (int i = 0; i < res.length; i++) {
//			System.out.print(res[i] + " ");
//		}
//		System.out.println();
		curr=1;
		for(int i=arr.length-1;i>=0;i--) {
			res[i]*=curr;
			curr*=arr[i];
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
