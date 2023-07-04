package leetCodeProblems;

import java.util.Scanner;

public class Cookies {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findExtraCookie(arr, n, k));
	}

	private static int findExtraCookie(int[] arr, int n, int k) {

		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(sum>=k) {
				break;
			}
		}
		if(sum==k) {
			return 0;
		}
		return (sum-k);
	}

}
