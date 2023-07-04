package leetCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;

public class SumOfDistances {

	public static void main(String[] args) {

		int arr[]=new int[] {1,3,1,1,2};
		
		findtheShortestDist(arr);
	}

	private static void findtheShortestDist(int[] arr) {

		HashMap<Integer, Integer> map=new HashMap<>();
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(i,arr[i]);
			list.add(arr[i]);
		}
		System.out.println(map);
		System.out.println(list);
		
		long res[]=new long[list.size()];

	}

}
