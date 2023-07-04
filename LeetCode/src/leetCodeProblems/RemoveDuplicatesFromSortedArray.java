package leetCodeProblems;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 10, 20, 20, 30,30, 40, 50 ,50};
		removeDuplicates(arr);
	}

	private static void removeDuplicates(int[] arr) {

		int res = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[res - 1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		
		for(int i=0;i<res;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(res);
	}

}
