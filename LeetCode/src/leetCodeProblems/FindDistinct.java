package leetCodeProblems;

import java.util.Arrays;
import java.util.HashSet;

public class FindDistinct {

	public static void main(String[] args) {

		int arr[] = new int[] { 9,5,7,8,7,9,8,2,0,7 };

		findtheDistinct(arr);
	}

	private static void findtheDistinct(int[] arr) {

		int n = arr.length;
		Arrays.sort(arr);

		HashSet<Double> set = new HashSet<>();

		int i = 0, j = n - 1 ;
		double avg = 0.0 ,sum = 0.0;
		while (i < j) {
			sum = arr[i] + arr[j];
			avg =  (sum / 2.0);
			set.add(avg);
			i++;
			j--;
		}
		System.out.println(set);
		System.out.println(set.size());
	}

}
