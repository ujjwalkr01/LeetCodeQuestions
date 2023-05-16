package arrays_Questions;

import java.util.ArrayList;

public class ValueEqualToIndexValue {

	public static void main(String[] args) {

		int arr[]=new int[] {15, 2, 45, 12, 7};
		
		findvalueEqualToIndex(arr);
	}

	private static void findvalueEqualToIndex(int[] arr) {

		ArrayList<Integer> list =new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==(i+1)) {
				list.add(arr[i]);
			}
		}
		if(list.isEmpty()) {
			System.err.println("0");
		}else {
			System.out.println(list);
		}
	}

}
